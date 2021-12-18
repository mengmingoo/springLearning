package com.mengming.factory;

import com.mengming.po.MyBean;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClassPathXmlApplicationContext implements MyBeanFactory {

    private String fileName;
    //存储解析出来的id和cLass值
    private List<MyBean> beanList;
    //存储id和实例化后的对剑
    private Map<String,Object> beanMap;

    public MyClassPathXmlApplicationContext() {
    }

    //    加载配置文件，获取配置的标签，实例化对象
    public MyClassPathXmlApplicationContext(String fileName) {
        this.fileName = fileName;
        this.beanList = new ArrayList<MyBean>();
        this.beanMap = new HashMap<String, Object>();
        //解析xml配置文件
        parseXml(fileName);
        //实例化bean对象
        instanceBean();

    }

    //    通过唯一的标识获取到实例化后的对象
    public Object getBean(String name) {
        if(beanMap!=null && beanMap.size()>0){
            return beanMap.get(name);
        }
        return null;
    }

    //    解所配置文件，获取到bean标签中的id和class
    private void parseXml(String fileName) {
        //获取解析器
        SAXReader saxReader = new SAXReader();
        //获取到配置文件的url对象
        URL url = this.getClass().getClassLoader().getResource(fileName);
        try {
            //读取配置文件
            Document document = saxReader.read(url);
            //创建XPath语法匹配解析xml中的bean标签
            XPath xPath = document.createXPath("beans/bean");
            //匹配获取bean标签
            List<Element> list = xPath.selectNodes(document);
            //准备获取id属性和class属性
            if (list != null && list.size() > 0) {
                //追历获取到的bean标签
                for (Element bean : list) {
                    String id = bean.attributeValue("id");
                    String clazz = bean.attributeValue("class");

                    System.out.println(id);
                    System.out.println(clazz);

                    //存储id值和clazz的值
                    beanList.add(new MyBean(id, clazz));
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    //实例化bean对象
    private void instanceBean() {
        //追历beanList 解析到的配置内容
        if (beanList != null && beanList.size() > 0) {
            for (MyBean bean : beanList) {
                String id = bean.getId();
                String clazz = bean.getClazz();
                //实例化对象
                try {
                    Object obj = Class.forName(clazz).newInstance();
                    beanMap.put(id,obj);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {

    }
}

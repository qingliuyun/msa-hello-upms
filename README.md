# ms-hello-upms 

这个工程为集成upms演示工程。主要介绍如何快速基础upms系统。在使用本工程前，需要已经正确安装upms-server与cas系统。

## 青柳云平台安装此应用步骤


### （一）配置hello-upms系统信息

1. 登录upms，进入系统管理。

2. 新增项目。项目域名填写 http://oss.mydomain.com/hello-upms ，项目编号填写 hello-upms（和应用名保持一致）。

3. 添加菜单。添加菜单，创建一级菜单以及二级菜单，二级菜单路径为/hello.do，并在二级菜单下新增资源，资源路径为/hello.do。

4. 资源配置。在公共资源管理->hello-upms模块中新增一条公共资源 ，资源路径为/user/currentUserInfo.json。

5. 配置角色。进入角色管理，为角色授予hello-upms的菜单、资源权限。

### （二）部署hello-upms应用。

部署流程参照青柳云快速部署应用文档。

启动时需要设置以下几个环境变量

| 变量名 | 描述 |
| ---- | ----|
|MEMORY_LIMIT|	应用内存，ex: 512  |
|WEB_CONTEXT| /hello-upms (与在paas中注册的应用名相同，斜杠开头)|
|UPMS_PCODE| hello-upms   (与在paas中注册的应用名相同)|
|UPMS_URL| upms地址 ,ex: http://oss.mydomain.com/upms |
|CAS_URL | cas地址,ex: http://oss.mydomain.com/cas|
|LOCAL_URL |本应用访问地址,ex: http://oss.mydomain.com/hello-upms|
|UPMS_API_KEY |upms的apiKey |

暴露端口 8080	


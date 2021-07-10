```
Git地址：https://github.com/apache/dubbo-admin

加速npm install
vim ~/.npmrc 写入：registry =https://registry.npm.taobao.org

clone 源码
git clone https://github.com/apache/dubbo-admin.git

编译：
cd dubbo-admin

mvn clean package -Dmaven.test.skip=true

cd dubbo-admin-distribution/target
运行：默认端口8080，
java -jar dubbo-admin-0.1.jar --server.port=8001

访问：http://localhost:8080

root/root
```
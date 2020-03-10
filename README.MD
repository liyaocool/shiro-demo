# shiro 用户名/密码验证登录 和 权限控制
## ShiroDemoApplication 运行后 
## zhangsan登录
```
http://localhost:8080/login?userName=zhangsan&password=123456
```
会返回 login success
## 登录后 访问
```
http://localhost:8080/index
```
会返回 “没有权限”

## liyao登录
```
http://localhost:8080/login?userName=liyao&password=123456
```
会返回 login success
## 登录后 访问
```
http://localhost:8080/index
```
会返回 “index” 拥有权限进入首页 
# FitHeAndroid1

tomcat Context.xml 수정

<Resource password="teamfithe123" username="teamfithe" url="jdbc:oracle:thin:@teamfithe.cx0f4cikems6.ap-northeast-2.rds.amazonaws.com:1521:ORCL" 
           name="jdbc/Oracle11g_orclFitHe" type="javax.sql.DataSource" maxWait="10000" maxIdle="30" 
           maxActive="100" driverClassName="oracle.jdbc.driver.OracleDriver" auth="Container" />
           

rootContext.xml 수정
<bean id="dataSource" class="org.springframework.jndi.JndiObjectFactoryBean">
      <property name="jndiName" value="java:comp/env/jdbc/Oracle11g_orclFitHe"></property>
   </bean>

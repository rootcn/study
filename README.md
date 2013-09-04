study
=====

cxf ws-trust

http://cxf.apache.org/docs/ws-trust.html

from apache-cxf-2.7.6\samples\sts.

need to config jce.

jdk 6:
http://www.oracle.com/technetwork/java/javase/downloads/jce-6-download-429243.html

jdk 7:
http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html


mvn command.

  mvn install (builds the demo)
  mvn -Psts  (from one command line window)
  mvn -Pserver  (from a second command line window)
  mvn -Pclient  (from a third command line window)


run window log

sts
------------------------------------------------------------------------

F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts>mvn -Psts
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building CXF STS Demo 2.7.6
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- cxf-codegen-plugin:2.7.6:wsdl2java (generate-sources) @ sts ---
[INFO]
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ sts ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 6 resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ sts ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ sts ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts\src\test\res
ources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ sts ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ sts ---
[INFO] No tests to run.
[INFO] Surefire report directory: F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts\target\surefire-repor
ts

-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- exec-maven-plugin:1.2:exec (default) @ sts ---

Starting STS
九月 04, 2013 3:24:04 下午 org.springframework.context.support.AbstractApplicationContext prepareRef
resh
INFO: Refreshing org.apache.cxf.bus.spring.BusApplicationContext@111e86f: startup date [Wed Sep 04 1
5:24:04 CST 2013]; root of context hierarchy
九月 04, 2013 3:24:04 下午 org.apache.cxf.bus.spring.BusApplicationContext getConfigResources
INFO: Loaded configuration file file:/F:/java/lib/cxf/apache-cxf-2.7.6/samples/sts/target/classes/ws
sec-sts.xml.
九月 04, 2013 3:24:04 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDef
initions
INFO: Loading XML bean definitions from class path resource [META-INF/cxf/cxf.xml]
九月 04, 2013 3:24:04 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDef
initions
INFO: Loading XML bean definitions from URL [file:/F:/java/lib/cxf/apache-cxf-2.7.6/samples/sts/targ
et/classes/wssec-sts.xml]
九月 04, 2013 3:24:04 下午 org.springframework.beans.factory.support.DefaultListableBeanFactory preI
nstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanF
actory@a3cf94: defining beans [cxf,org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor,org.a
pache.cxf.bus.spring.Jsr250BeanPostProcessor,org.apache.cxf.bus.spring.BusExtensionPostProcessor,cxf
.config0,utSTSProviderBean,utIssueDelegate,utValidateDelegate,utSamlTokenProvider,utSamlTokenValidat
or,utService,utEndpoints,utSTSProperties,UTSTS]; root of factory hierarchy
九月 04, 2013 3:24:05 下午 org.apache.cxf.service.factory.ReflectionServiceFactoryBean buildServiceF
romWSDL
INFO: Creating Service {http://docs.oasis-open.org/ws-sx/ws-trust/200512/}SecurityTokenService from
WSDL: wsdl/ws-trust-1.4-service.wsdl
九月 04, 2013 3:24:05 下午 org.apache.cxf.endpoint.ServerImpl initDestination
INFO: Setting the server's publish address to be http://localhost:8080/SecurityTokenService/UT
九月 04, 2013 3:24:05 下午 org.eclipse.jetty.server.Server doStart
INFO: jetty-8.1.7.v20120910
九月 04, 2013 3:24:05 下午 org.eclipse.jetty.server.AbstractConnector doStart
INFO: Started SelectChannelConnector@localhost:8080
Server ready...
九月 04, 2013 3:24:26 下午 org.apache.cxf.services.SecurityTokenService.UT_Port.STS
INFO: Inbound Message
----------------------------
ID: 1
Address: http://localhost:8080/SecurityTokenService/UT?wsdl
Encoding: UTF-8
Http-Method: GET
Content-Type: text/xml
Headers: {Accept=[*/*], Cache-Control=[no-cache], connection=[keep-alive], content-type=[text/xml],
Host=[localhost:8080], Pragma=[no-cache], User-Agent=[Apache CXF 2.7.6]}
--------------------------------------
九月 04, 2013 3:24:27 下午 org.apache.cxf.services.SecurityTokenService.UT_Port.STS
INFO: Inbound Message
----------------------------
ID: 2
Address: http://localhost:8080/SecurityTokenService/UT
Encoding: UTF-8
Http-Method: POST
Content-Type: text/xml; charset=UTF-8
Headers: {Accept=[*/*], Cache-Control=[no-cache], connection=[keep-alive], content-type=[text/xml; c
harset=UTF-8], Host=[localhost:8080], Pragma=[no-cache], SOAPAction=["http://docs.oasis-open.org/ws-
sx/ws-trust/200512/RST/Issue"], transfer-encoding=[chunked], User-Agent=[Apache CXF 2.7.6]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-16190602">http://docs.oasis-open.org/ws-sx/ws-tru
st/200512/RST/Issue</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http:
//docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-30540747">
urn:uuid:e53e140a-3ace-41b7-9181-dbb39ac13a6f</MessageID><To xmlns="http://www.w3.org/2005/08/addres
sing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
 wsu:Id="Id-25095750">http://localhost:8080/SecurityTokenService/UT</To><ReplyTo xmlns="http://www.w
3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecur
ity-utility-1.0.xsd" wsu:Id="Id-5062832"><Address>http://www.w3.org/2005/08/addressing/anonymous</Ad
dress></ReplyTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-w
ssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecur
ity-utility-1.0.xsd" soap:mustUnderstand="1"><wsu:Timestamp wsu:Id="TS-1"><wsu:Created>2013-09-04T07
:24:27.361Z</wsu:Created><wsu:Expires>2013-09-04T07:29:27.361Z</wsu:Expires></wsu:Timestamp><xenc:En
cryptedKey xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="EK-FDAAB3AADBF82F327813782794675481"><
xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/><ds:KeyInfo xmlns
:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-
open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:KeyIdentifier EncodingType="h
ttp://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary" Value
Type="http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#ThumbprintSHA1">l38MHAoulTT
TEKjgU4D1ZTUkyj8=</wsse:KeyIdentifier></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><x
enc:CipherValue>UFELzyvp7dQc4dJlQFgzt8wW0oCoIISMm40X2g81oYhpplmwP1rEorVfi5dWwKrkPSjYaxeOct6Esmsa60xX
YkZMQbsoeilKKMl2VZQEvxjDE0PZf0iwx9Bd6vomtEDV/KpaQo3cqJaBxnX2052tEKMnOKvfM9w9Ulyssa0074E=</xenc:Ciphe
rValue></xenc:CipherData></xenc:EncryptedKey><wsc:DerivedKeyToken xmlns:wsc="http://docs.oasis-open.
org/ws-sx/ws-secureconversation/200512" wsu:Id="DK-3"><wsse:SecurityTokenReference xmlns:wsse11="htt
p://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis
-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey" wsu:Id="STR-FDAAB3AADBF82F3278137827
94676422"><wsse:Reference URI="#EK-FDAAB3AADBF82F327813782794675481" ValueType="http://docs.oasis-op
en.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey"/></wsse:SecurityTokenReference><wsc:Off
set>0</wsc:Offset><wsc:Length>24</wsc:Length><wsc:Nonce>xO9pBniz/41UuHl2igMLDA==</wsc:Nonce></wsc:De
rivedKeyToken><wsc:DerivedKeyToken xmlns:wsc="http://docs.oasis-open.org/ws-sx/ws-secureconversation
/200512" wsu:Id="DK-5"><wsse:SecurityTokenReference xmlns:wsse11="http://docs.oasis-open.org/wss/oas
is-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-soap-me
ssage-security-1.1#EncryptedKey" wsu:Id="STR-FDAAB3AADBF82F327813782794676895"><wsse:Reference URI="
#EK-FDAAB3AADBF82F327813782794675481" ValueType="http://docs.oasis-open.org/wss/oasis-wss-soap-messa
ge-security-1.1#EncryptedKey"/></wsse:SecurityTokenReference><wsc:Offset>0</wsc:Offset><wsc:Length>3
2</wsc:Length><wsc:Nonce>3QuNdFdgE7WlulThPWWWTQ==</wsc:Nonce></wsc:DerivedKeyToken><xenc:ReferenceLi
st xmlns:xenc="http://www.w3.org/2001/04/xmlenc#"><xenc:DataReference URI="#ED-6"/><xenc:DataReferen
ce URI="#ED-7"/><xenc:DataReference URI="#ED-8"/></xenc:ReferenceList><xenc:EncryptedData xmlns:xenc
="http://www.w3.org/2001/04/xmlenc#" Id="ED-8" Type="http://www.w3.org/2001/04/xmlenc#Element"><xenc
:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="htt
p://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-open.org
/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Reference URI="#DK-5" ValueType="http
://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></wsse:SecurityTokenReference></ds:Ke
yInfo><xenc:CipherData><xenc:CipherValue>VxGyOlk8qdslh8q+PhxVQyiFIpbXddd4jy8GULBZTARKzTOXn99wevILoKE
5eSF4s5MnWWZjfJ/KOLB5JFq1mbE6PCysk7IyQc8ExYRqTdCwZ87b9keAdVSHsR1cS1Yc9Ib4I8WCmGWWR5lMYSM7p/lYgWAxlQO
EvXKBrUpU+TWjHFWKIZa5YWcsbaJ3JMquSpIZwVdeCulcYzWPkIq5d06Pe/K5kfZHyRlr78GhHFuV+tyqXezzXxs4t4KDPcgzDlp
h2bJVeB1cbMZAlzL9V6axB5x4zPH4tH88QrKfcXV99vOxQi+HS0A+hm1On2u5hnfR60Zy5CutX9DUsKp4qTqcdf4o1tR4QfaWvTA
J1mA=</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData><xenc:EncryptedData xmlns:xenc="http:
//www.w3.org/2001/04/xmlenc#" Id="ED-7" Type="http://www.w3.org/2001/04/xmlenc#Element"><xenc:Encryp
tionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="http://www
.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-open.org/wss/20
04/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Reference URI="#DK-5" ValueType="http://docs
.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></wsse:SecurityTokenReference></ds:KeyInfo><
xenc:CipherData><xenc:CipherValue>AmW+7k1JBjg/W2UKYvDAMVt0FdreNmgude2a68F28/WRYMhGuyNK0kAnJmBxHqgr6u
mB/8VZ1MXYPqoFdpAMMefME71n2VKMQHDEn4611T4Gz4bRaUQfaA1JNial3Z1lrOF4UF5spaybRSabT0WBGmc1bk11vSMI3VT4qs
GkiqL/b6lyNRHUDHCWcdDWXjRDnA3GmFEX5Vd4Hh2gaZ1zHoO9RlOCQW6RyydpFe3jSCXDElYMHOpxdVEVU+M7brxS+Wk6SWgcoL
MmdhGrgQ0F4dRoprgQjy08S0IWrBKeJnDOjdCK+yAqZGy44JRkUoPU0z2Ce/ajWl+UchyDYvmHOX7rUwCqkKx+nNCiDhrD3wz+1L
e0LUf4P+GjD5kdRK/QpC3tDrymaimiwXl41m5SQLh6jKT3cRbm+b67ANUZflf3tqUBLYu3H5q6WM/qB1fgkeNfzVhNCPBd8yr0XR
nkrPpaLbk/L2GrEA0FPVvijzzTZXdvu7d6glBRhug3Ubal7/WUHVclfEBwgFXQwPbA2yXaHusbQj8y8iowFLhOpdmm0iYiMWAJ0s
6tVSbyNv0KAKzf11Y2nLTGTbhs6kLciySr9hmb0hik8uHLozTYyBcccuaXfKQ/RPkZUBjniOJEnm7T5RuVQn7vszHg6MxIKTE8pu
4seq2bRcLOPGazKTyagGx8g+0ohuW1XDriUdi1p8/S4yX1Bowdj/it/gRBjVyD9NlbZXExUAY0NAjbQjdUZVCU5dZTAa47N3yn3b
x+zpyaGypzOhD234Mb9zzTt4yRx9mDmzhFxje+tb9VSpq0wDWwX0NAXS8FknWHUewOL0SzV7oNuAGBeZnPieBLn5uXOicoiLrysr
A4k7iT3Qz9DZ2v0jWU5u/4kMM8IuDPBb91a+xc24CX4xsosYQIDkLp9xFsj40fZNlrIwU5TskDhruGZjbC6yTI8wNh7kBmNlIxOo
h41mATbB5ssq92DwVVp7cpwIecrfeTWQ7HcsoYNbmiXGiMuBXNOmHy30FWkrwgaIgAgQR3hjt7Ojz2BP0nDXuBpHBYmL3Co/yCEQ
9qwAVLlu64yvWN4kVXyMnpN+Du2qRfEoGZJgaAC3KP7UXXJBkzqfYwci2m218zUarWZGG0O+9zSDkTGb3mcqcH70bFiIfZsNPDlm
X7SVzOedsjFFkfA4b9ofMC2gy78JlXA3sbHcWhb/9NN15BiW/QnysC6zOXddpdhV3kpTLimKiS3IPXUUwxR5kjZudXF6WR9+lc3I
HNAN5l1qenW3FAy5qIRbBGVocExd9LufUbZO25Ou14yBeCtlI6/DwRaFWxQetRfCHi2UPNBTkGublnLIwnToQzy3PyQiep62MgC/
2rSvKcSYkO/hZKgZjnO6ad+GofsNbaCRaO3TfAh4gz6pFznvLs6COT9NzyuFVbDkF6FeX01MpdgNiaPVTh8we8GdNLq+/ZEQEhgV
rXqY9MrKFNQJo14SuSdykhqPIHvSn2avtXbgeZTThpX0WYzUDE7kSMrMtf8nj8Y/RvcYZuDzflweZCBnzkOwO4FCwY0rX7wJUZZZ
HSVbpGWKxsyfqipLQ4Bn5USLo1nhObApHcaKT+aqUW6zRxgki4judwiBtBVtJSfI5dX7vXj7WkR3Ug3j1rJcJ68pbl1V69iKFBbz
JA/OflCt0gmrHRcJ/Xx7aEZ/0qxghW6zkkLtD/o5Eqjz9Q9bMOAH1HgnHW3qK0ys8GLhjNz7oZQj9cHIqMFT6qlf8mU1dcMouV+N
G9xyOkbnnX+WS3mb1ci0TcoW176MGJgAA7afsy16h/bn0f7Y+vQ4Lrnldr8QcNJ1qj8ZN3UuFKsd46JOdo5pEHuHOsaKyS9fBRZr
9qyOqmcAXq/g70ullGzuSZEUEkvwTEMQZ0WGY88FLKZ/016afNhzZngD/T3duN2KiiKfFgw0m1CNxTHej/Gq3Z5y8y63vmoTqzaY
CwyB/+r3Z2KTnARx+l+feKhiAl/RncA9GwU0YGjHUL9ltiMux+zTbppXYSSE5lDisjC7m8+c7gXgZCIBFd2rBi4kwnGiWnb7shby
XfX6SYdAr/0+nKxALlkG5WR8O2GUa749KuVKocgupQHVkXCvNb2Bs6CU9JikUWdLdSd28U8YtFZaqkW2tsGqVFyK8JeJRcUh94oY
k7eYpLJ66G5oks5cmyVZnnD8fjhorrx/PGcwZFBNrrPlOqGS+QYsQ4kDRcY150JzHPoAiPRMhmoySusmjyEsjv0p2IxGzwjbjLGY
5BhypjlmahWjpuqXbkuY8+w/DAlixT+NPnlIERSnKbTMxie57vtMebKrMThzDONJQgxSGodOTNkmAO89WB7rH2SW+ZoXgzrxWjOS
k3bzN2Er+3IL/TvUvorFvNDpYMqpI9ebQwnx5vB7+uJWxQE5vXjMfh8e76gTMykHfOF3FyYt90T720cRN4XrrSc2edgjBLVCSdm8
ox2YqqRpMqursuD32ARLw0ewBNhdN6mZmgkf0/kqfE6h7Li3wva6uksQKntxnz0ZrM/2IPWtSwt3lML3rUbpSptj9DHTqJ4S1AvO
snK7JD13E9LvfFA/WrF7KAd5VG4+/wrpgCSNf6fYa6WKmNhpL3Ngjrwul+VaNi7yFgvtwOSDvlm2ro2i2z42wQdGXq/kwqGBceU2
1CyPJKdLZZ+jbyvNY1Ul4ofagpZrxBw1EMWIcyTZMhoPUnzuzSvE/FVQ58A/jXfKPZWnypukfWzWE+4O5fKG9gLxeUG6pqIKs677
0/mjhzSgbtiDjozj/dzsi+5DFaldwXPWwuoShPqPpRXj9Zwv8Ew9Qbno2iUX35AaVJYJOSkv40ICoLpQTg3WLQZ1oiiS7wCpd1uX
mYx9/hGEV1ZmBSau0mUOaEmg/hQmECz/rkB84pm6ZhaCghsbTUnvGjO0GnYsmADvU7B1VkxClK/zv2J32O7t2nKx19eQQSnLn9zn
mm3s1Z6v5fpgSmlVIDqoz2njK8Aqv5o93r1/LpJ9OdRUgOeeFG/xjtZlymNI9pJZio4aY/YdoNpof6aL7IeOjT5PqDJVn0MAQat9
NkZGaR2DiWlxigb7BKR8fSglGv0R6VVru5Z/wf80pAKmpWYihWb6AGPH4HF49RkwFsn5GSOi1KgMdqVsZSwQbltEZgi5Xd7SM1V8
7C38Bb2KhRCZ5piKf51oP6ZSJNfwjmaIoPHgR/COycdFBt6OmRxgQQp5MWcLOriq0cjPJj6dfnJiICM2qPaZxRBG/Rdggjrf/2xw
WSXloc4y5V/CzaNTeKhXLtJItHpgHJqh/o7bDa0ps5zzXeArXfWmOT5EpsT5tb+56Pbfkl+oA2Jos2B+oLUcN+LrXwqOnuEguxac
33B7VGEtY92Tzi4gVtt+bJi9YuB7SzEtto49j8XRmFNKRdTOj5wYekuiDWZFGJVVH4vXmUslJ2BTQ9P/qnXUOzUREfQ/PYWKEhso
QTOhxfsxxpv5MQ/URSRPKD58ik3uemWdB7ijzySq3+/pXP4XARmtcd2GSt17halmPuWxigISjkjgOpEK9DbF+hGNq97TRFFUyfL/
gue0rspGPC6lPLep8OIi56EFh/mZMAwmGhcofiJVTFffvPcZRAwdaFfG7Y56lqH4+/VH+iUvcRKNXEWJZWslwmy2g5QocoQ0TlMf
hQR8/Lt+WlzCs+Br6sZrgwWIgL66T/OTD9GNkcTlEiJjiCz82k5nlWX1SRx0CE8iZeOg8Y4DfGL0uNsIPt88GshY3m592/YJhCRN
cgonbAnpRxIPwOYDkrlWtCoBwOs6uD+I6XQARXND2E9BxSTf+63Qzxec8/FreT4lI6OmBYCqHxO50nEz/ovNn9RPs1izsI2tI8yk
D/AxYylU4vbmXu+8roe2bfZHada6ZrZb0A1ywMzH1mtURoDKIMRxDLo7IUoTTAUUeTl45ICySl03gqa/BkPZPRh6Gtkii2I6EPjF
GMrzxLo9GLj58f8iO8Vhj/q31dVZrEWK1ckOM6ZBg2+b5qfG9eKfqG5kv0x3HXpHztZxw070rTmzR0hHuCrCr5kJsR9ljm1d3iIx
yTB4JV0gO89/XSblGSQhLOk0PAx2+EMJaJDd8Tet4LNfu17mVSruujf1FufUjKRk55fIZ/V19dasGnvoeL0f7U8/goGqlVgDpSjy
BY6VvttFgO2ZoiW9+xEguFtZyexSVsSpYRMkIT4ofQWWmxl8LrEofdO8eG6GvH/ZWhR3lLbT+3Qv3X9ifdKrOPrp1zne+/JvVezU
8ANzQUI93H5yU0cI4mNATjr3pnQHAAxH//oyNaoyRQ5ADlJsyFNwCD7p/l/yvNFL+HEtB8zaE0opTwO8dF6dgJjmEsgQLqfI4TL3
LksCZ7o6xRODf+aBkeIcQlfmPRLiP/Q7duA0VddOhIHgIPKfoS+a2FxBZgntQclbqhPDITs5YAKylZGDuTZqAYpZD2bb9Ff+3TI1
6cLyqGcJ/jDdXkS/YpWqXtNIRi413BN0glGNiOtU8C1tAVgEMeDIhmN+fOcfyaSXWYfhyx+K7u+JixPeQhA9p4FcI4hOW2c+JdhV
I7/8+pD++ZUcC8G40nW4GWdc746dE7bIA124tuYr0/rh1JyZ2CQ+pzklgyZCV7C5gTmSwJmnIyhjBngjkmi1W35d03Il4GSkWxig
fiXO6jAYFY7Wfh/JpJOBjbEs+VPi5wRBuwm3C9svW0B/ximge/MCii6SbhQsgZN2P+CyPnyZEK9dq2VdAQPQrOVaNYqOl0KoiNHN
MB4eNLoNLlpI9zcpJEDOFOFlH3ha6zqYp1UFLFXe+FucITRSShJoR+s5EiV8vd8LrvJ857sSYdhgY8rdrLCYTQlOp3RLodQwzU6A
MEnt8NQrnC/xCHJi/QinUat7ebTKs6vdaWi24QClqyiCe20eai3oE4kmFoTE5KwQNrDm6mNSmqK9v4FYR4LKbcdYV9bKmj2TA1ZC
RbW3OPzzv++Jzeju8z5MVGpFOBqmFPoEcq0jo/UUwrt4Gf5jEjYqWTLDzQG0OzFWRsB4qPESZv961fTmcNLVrfRA50</xenc:Cip
herValue></xenc:CipherData></xenc:EncryptedData></wsse:Security></soap:Header><soap:Body xmlns:wsu="
http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-17783
924"><xenc:EncryptedData xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="ED-6" Type="http://www.w
3.org/2001/04/xmlenc#Content"><xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes
256-cbc"/><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xml
ns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Re
ference URI="#DK-5" ValueType="http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></
wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>KQ1jaDGc09yPAls7EcHC///k
AgcVTuEAuki5Nt2i1H9vGsdQnHuWeYXdvnwYQ6t16w5np0kRad9qZrr4baVEOFIpRweRJhm5B5N+Z42TwvK+Oo4S6AClcEUMGK4W
GL/A6x6jLotU7lMCH0vF0BfZdos6uyWhdY6Rn60djf4dG35U5Ttpi2/OIn+wbhM+qb70LeK9kGM8HDQm843KuBLwVyBcedeFFwWR
9A5kA1Zcrk8gjAqf1sZb/gdrSA3ievaFKw2dYHo640PEHC+EcXiLm791eU/li6ILZ8InNa8krcb8ZIDY26Te8uCLW1nA1Z3tF8rZ
/H9uKKU6e4FftJ8SrCHctUnnSLJkphIfCMlQyWAf4x1bx6Vd/ea0gGSf4I+1qDqYA/9Nvp/uBIAuvgNFcc80Qg7BYvagpS+o9iSZ
bRI9Q1iJx96ggcT6RMONyDHsQ8kTB2ka3GLzHzzhMGrjVb9pY4Et5LToxvA6qbU5SO/9h5O3ItvQgQQ2vtVFBieBOPTwOYP+uMxS
Sf9q4M45FOa4PtnWbm0lMsHCdneJpJoGZt02FGGSm9APCDbTzz0MZ4vQOApGHkNBCfVR6QRHrmtaQB/daD+ZiLp34SJ954RgPvg5
uMcSJazzsIsuCnBy0aXJmynubQwQ+5ny0l2IYjR4x4B5Ph/thQqMPK8FyzaDq35ArtXApvTMCX/3YySZkK4XV2UDzzE5YfKhXwIY
5dwrlF0piDSAuqiwUPtSs9mJhYSoUVyjEE6m9ioCizZNHo102Fynfv3pHu+/mSf4uUmdVNrYUBlde7QEekaxifrpCK070JKTR/MZ
GeaUfiSHUPxvgaFudT5rUaB0HWZZhxqA3nj4R1HV0oipqgVB/pjT+Hp6rhFL87MA/lIz6XQiNbqyLJhoCR91R6iEetq2Y9We3oWE
s5cARLvaz2Qmn52qGhLG3EdB2gEjTNOMudE7b2EGxm5eH7XnNMHctt1tYjM4zIBMslwm4BF201LqHSd4/F+0NzRPK/B1AZeeAhKS
S9EPiNC232OCQ7PdZnN5w5diMC+8L3Q2g9sKTIdn7d4jlihZddgfiJ5FIMqQakzFyX8uNL5aUxsITpJ4KQ4clVvOIoU/BvAgCWhR
D0c5X+vbXemz7/IbMY1cjxa9gz3QdacW7fesbKrOeffuwohTtLVWiy7a5z+Ly+ksmEUkWVX62z0U0UpGQrq+HcD6RsATL4fG5O/r
k2/37Q9/cbc/N6p5QSCoEdJ8NKTNcKa240UuTjFW+Ofn6KsdSkRJGQBvE+6Hqh2R8302F1zxc8wp8EQ5XfejicPa49xFMHTYTYau
ckrNGfSHRRfGOQjbtaa+jv06TS0UuFaOxpQ+oxWtRxQ8y7AJOzxyZ8E8vOF60DcRAzWueyElZKVNPetMpB557hdd+9la5/8VX4j5
VN7Sx+8HxOcDxghozTlZRp/x3fzMh5IGv0U2kmO81sVtzimmyYXJiscpBbtsiXTE2HBA/RPVlLT9hW7tEp8vuvH1V+Jt8sNcAGAK
bHR3xhATUy/CCfqRg8TY3hM+BGIIwUXxHwSn8Lf0ODtPKl6hnqhPSatCNUNNgIakhPy/jk5zza+MVZfTHO6yvNBlNJv4tYDdh5br
fUK2NwURM8TgVukvNlqAjoIL5l8Le6JkMYZ/VWGfUdH/vIamWigHsJppQisTxEycppAof1lBjY0cuxaEs0yo6yoj/5XgML/kpkX5
ypOyHltSH9WAkJ6hYOGrkQhi0WvyFmzoYNEyv4D7tuhBaQPW8Se811Hh9UE9C33mKO3CtFtIajKgg5c8fORdpPBsXJtn8CxGmBh5
tAQhln3jtR6Cg2udsHV0GDDddH3JpjDAxj63eJui5Rh0jXE0UilSjPb8o/EWYiZOQP6nyQGpB/VEW18+vFMS8q4dm+TH1ikabmBB
thDzMoXje+SpiqLK883xk1iKprUg9FDzG/2vhpn9XsLyDt+LoTmWyWyuRGiWAuUSoKCCotVmdvkLMu/768WmDt+R5Wfjge+CB2Hs
c450oIFfRXjyAhRrLsrpAYvLnklegIvIqdCIgsuvDiGC0nkUArbS+KhD02RlMtbejly1FFCnuHB41A9uIBjiLb9sqm4IDf21owkm
ImxqgaySW/5oJgefiFSIYj+dV5Gtti/4AAmXZeLx/icMGEyzC0mYz79TJcjUQybLBthvLKKi6OqP38nKvzXJ71gqUvhc/dKSdpMb
OJMO+kw42r9YBXEiPWILRMrO/sCFjB7QHy/agUqoZXMPXBs4GcVGW83u58gsLjMGFIVCCmRxDXg9lcOqhjvd0E/rrMUB8v/NnnWQ
DHqRpr19ARTg/auUK4ltG36QvI88hMmNWy/Jkf1+XHUprREK/+0mcStzxK7wDa/lDYNPOujQX+TfL/NUK959XWtLpDV8x5WmET5s
8CuGg9UBfoIh4e87emqKQMGVwMeMc4ThqbP0z9ACkQBbMfttAqjJ/XEdKa8IVzM4yA0MUtm1c/kc/CojgTFIOPrP6y1jxt5M9PeY
ui4s1wThUMqwbq07vIVzbR/TyFWjOYo7pFQv9YduUILfgUtBHxkyq4ATibetoTWCMO2C+Cs7L5MaTWVfbkqC2a/Tli5LSsIHpvid
4ktgVrDkeGGr5oKro7xiQoAA69CH9yM7CuIDQt3pSTYiYk0LXP5VmSGDvDEGTR9QtVlIdg0FiZjS4BmMJmBToBZw+BHzRcSuPW6o
8Ziz8aYXMd800DrRVBRmXjHNy1ssWd2XSVV18Da9Vvc/xoSCk/fGKFwt2Az7vSj/0geWsfxCnVKJ1D7XZisHivpF747Wi1Dwe58f
lxPxIyTu4a9jH28DuyTYMA2j99saUYN98szS9w4+uklHfdrpl34UnhQfclQ9T7PZ+z9+46n5zxvTKbLmCVEhMxBeSN79zDUnOppK
vqFSRo9cEDsW9spjPfOk25Bbs+QjUC/z+YtMcV4Hf0eJGQYMerqQN0roP7a7x7x6I4rvDtO3FHCIJsl1rwiuFe/ctFGwfnB1N4hU
YvNEISrTWWVoEci61Weuz//fiiyO2AyVDlUAICHkNdksaWxt1dqwx6M/wltJhcccAli6EXea6fFsNnB7Dcbzl3fxNv0D9WS+jHym
w7NsTB5vocGKYVNPxjnSPrH7O7GqEILpRCQz4rxI1FFIPWW9k0bAv07zwfG7uVGagmFjgML9H24k1ttQMo2HIs3XPOXhfdEuImkf
Y2E8m3hq4h8w3l2Bjk4=</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData></soap:Body></soap:Env
elope>
--------------------------------------
九月 04, 2013 3:24:29 下午 org.apache.cxf.services.SecurityTokenService.UT_Port.STS
INFO: Outbound Message
---------------------------
ID: 2
Encoding: UTF-8
Content-Type: text/xml
Headers: {}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-8679710">http://docs.oasis-open.org/ws-sx/ws-trus
t/200512/RSTRC/IssueFinal</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu=
"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-2954
5751">urn:uuid:d1f91305-ab6a-491b-9b8f-7bf26907e330</MessageID><To xmlns="http://www.w3.org/2005/08/
addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.
0.xsd" wsu:Id="Id-20359617">http://www.w3.org/2005/08/addressing/anonymous</To><RelatesTo xmlns="htt
p://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-ws
s-wssecurity-utility-1.0.xsd" wsu:Id="Id-3410462">urn:uuid:e53e140a-3ace-41b7-9181-dbb39ac13a6f</Rel
atesTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity
-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utili
ty-1.0.xsd" soap:mustUnderstand="1"><wsu:Timestamp wsu:Id="TS-1"><wsu:Created>2013-09-04T07:24:29.18
6Z</wsu:Created><wsu:Expires>2013-09-04T07:29:29.186Z</wsu:Expires></wsu:Timestamp><wsc:DerivedKeyTo
ken xmlns:wsc="http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512" wsu:Id="DK-2"><wsse:Se
curityTokenReference xmlns:wsse11="http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xs
d" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey
"><wsse:KeyIdentifier EncodingType="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-mes
sage-security-1.0#Base64Binary" ValueType="http://docs.oasis-open.org/wss/oasis-wss-soap-message-sec
urity-1.1#EncryptedKeySHA1">GiW8lcRPF3olh8RBOh7yA8e5R34=</wsse:KeyIdentifier></wsse:SecurityTokenRef
erence><wsc:Offset>0</wsc:Offset><wsc:Length>24</wsc:Length><wsc:Nonce>E3Y+BTakGrsaAJnvm5hDjA==</wsc
:Nonce></wsc:DerivedKeyToken><wsc:DerivedKeyToken xmlns:wsc="http://docs.oasis-open.org/ws-sx/ws-sec
ureconversation/200512" wsu:Id="DK-4"><wsse:SecurityTokenReference xmlns:wsse11="http://docs.oasis-o
pen.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oa
sis-wss-soap-message-security-1.1#EncryptedKey"><wsse:KeyIdentifier EncodingType="http://docs.oasis-
open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary" ValueType="http://docs
.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKeySHA1">GiW8lcRPF3olh8RBOh7yA8e5R3
4=</wsse:KeyIdentifier></wsse:SecurityTokenReference><wsc:Offset>0</wsc:Offset><wsc:Length>32</wsc:L
ength><wsc:Nonce>/EaM69Yfol4Dq+l6kUQO5g==</wsc:Nonce></wsc:DerivedKeyToken><xenc:ReferenceList xmlns
:xenc="http://www.w3.org/2001/04/xmlenc#"><xenc:DataReference URI="#ED-5"/><xenc:DataReference URI="
#ED-6"/></xenc:ReferenceList><xenc:EncryptedData xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="
ED-6" Type="http://www.w3.org/2001/04/xmlenc#Element"><xenc:EncryptionMethod Algorithm="http://www.w
3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:Se
curityTokenReference xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-
secext-1.0.xsd"><wsse:Reference URI="#DK-4" ValueType="http://docs.oasis-open.org/ws-sx/ws-securecon
versation/200512/dk"/></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>
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</xenc:CipherValue><
/xenc:CipherData></xenc:EncryptedData></wsse:Security></soap:Header><soap:Body xmlns:wsu="http://doc
s.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-12706655"><xenc
:EncryptedData xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="ED-5" Type="http://www.w3.org/2001
/04/xmlenc#Content"><xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/>
<ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="h
ttp://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Reference UR
I="#DK-4" ValueType="http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></wsse:Secur
ityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>cWm+phXCydzHP77P0UNmg3K/VtSooJ8QCx
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
H8MeABIb21nCjBIg==</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData></soap:Body></soap:Envel
ope>
--------------------------------------

------------------------------------------------------------------------














server
------------------------------------------------------------------------

F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts>mvn -Pserver
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building CXF STS Demo 2.7.6
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- cxf-codegen-plugin:2.7.6:wsdl2java (generate-sources) @ sts ---
[INFO]
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ sts ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 6 resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ sts ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ sts ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts\src\test\res
ources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ sts ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ sts ---
[INFO] No tests to run.
[INFO] Surefire report directory: F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts\target\surefire-repor
ts

-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- exec-maven-plugin:1.2:exec (default) @ sts ---

Starting Server
九月 04, 2013 3:24:15 下午 org.springframework.context.support.AbstractApplicationContext prepareRef
resh
INFO: Refreshing org.apache.cxf.bus.spring.BusApplicationContext@1cb4a6a: startup date [Wed Sep 04 1
5:24:15 CST 2013]; root of context hierarchy
九月 04, 2013 3:24:15 下午 org.apache.cxf.bus.spring.BusApplicationContext getConfigResources
INFO: Loaded configuration file file:/F:/java/lib/cxf/apache-cxf-2.7.6/samples/sts/target/classes/ws
sec-server.xml.
九月 04, 2013 3:24:15 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDef
initions
INFO: Loading XML bean definitions from class path resource [META-INF/cxf/cxf.xml]
九月 04, 2013 3:24:15 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDef
initions
INFO: Loading XML bean definitions from URL [file:/F:/java/lib/cxf/apache-cxf-2.7.6/samples/sts/targ
et/classes/wssec-server.xml]
九月 04, 2013 3:24:15 下午 org.springframework.beans.factory.support.DefaultListableBeanFactory preI
nstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanF
actory@10642c5: defining beans [cxf,org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor,org.
apache.cxf.bus.spring.Jsr250BeanPostProcessor,org.apache.cxf.bus.spring.BusExtensionPostProcessor,cx
f.config0,server]; root of factory hierarchy
九月 04, 2013 3:24:16 下午 org.apache.cxf.service.factory.ReflectionServiceFactoryBean buildServiceF
romWSDL
INFO: Creating Service {http://apache.org/hello_world_soap_http}SOAPService from WSDL: wsdl/hello_wo
rld.wsdl
九月 04, 2013 3:24:16 下午 org.apache.cxf.endpoint.ServerImpl initDestination
INFO: Setting the server's publish address to be http://localhost:9001/SoapContext/SoapPort
九月 04, 2013 3:24:16 下午 org.eclipse.jetty.server.Server doStart
INFO: jetty-8.1.7.v20120910
九月 04, 2013 3:24:16 下午 org.eclipse.jetty.server.AbstractConnector doStart
INFO: Started SelectChannelConnector@localhost:9001
Server ready...
九月 04, 2013 3:24:29 下午 org.apache.cxf.services.SOAPService.SoapPort.Greeter
INFO: Inbound Message
----------------------------
ID: 1
Address: http://localhost:9001/SoapContext/SoapPort
Encoding: UTF-8
Http-Method: POST
Content-Type: text/xml; charset=UTF-8
Headers: {Accept=[*/*], Cache-Control=[no-cache], connection=[keep-alive], content-type=[text/xml; c
harset=UTF-8], Host=[localhost:9001], Pragma=[no-cache], SOAPAction=[""], transfer-encoding=[chunked
], User-Agent=[Apache CXF 2.7.6]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-15165035">http://apache.org/hello_world_soap_http
/Greeter/greetMeRequest</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="h
ttp://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-295384
65">urn:uuid:06f41687-bec5-4169-b107-e79efe69e243</MessageID><To xmlns="http://www.w3.org/2005/08/ad
dressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.
xsd" wsu:Id="Id-32299982">http://localhost:9001/SoapContext/SoapPort</To><ReplyTo xmlns="http://www.
w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecu
rity-utility-1.0.xsd" wsu:Id="Id-22202345"><Address>http://www.w3.org/2005/08/addressing/anonymous</
Address></ReplyTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss
-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssec
urity-utility-1.0.xsd" soap:mustUnderstand="1"><wsu:Timestamp wsu:Id="TS-9"><wsu:Created>2013-09-04T
07:24:29.327Z</wsu:Created><wsu:Expires>2013-09-04T07:29:29.327Z</wsu:Expires></wsu:Timestamp><saml2
:Assertion xmlns:saml2="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:xs="http://www.w3.org/2001/XMLS
chema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" ID="_CE19E68ECA663EC06213782794690301"
IssueInstant="2013-09-04T07:24:29.030Z" Version="2.0" xsi:type="saml2:AssertionType"><saml2:Issuer>D
oubleItSTSIssuer</saml2:Issuer><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:Signe
dInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureM
ethod Algorithm="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/><ds:Reference URI="#_CE19E68ECA663EC06
213782794690301"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped
-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespac
es xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="xs"/></ds:Transform></ds:Transform
s><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>EeHzgoNohbrT3
diR5JDCogRS5uk=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>hz0JzicZhAEhOT4h11
Bk0WrxW3OyQ3+c/6dFbApnMtDEHj0OmK+isqXKSablineHYE6OclJBpI3ZMgtXeX/NBrmfmpsSc81pruGlk5BiQWyMRuyDG6LYim
isz2psE4Uzi5W6OZAKMJzb96IDGXVF7AxA1U9Op32omhRmxoYL7l0=</ds:SignatureValue><ds:KeyInfo><ds:X509Data><
ds:X509Certificate>MIID5jCCA0+gAwIBAgIJAPahVdM2UPibMA0GCSqGSIb3DQEBBQUAMIGpMQswCQYDVQQGEwJVUzER
MA8GA1UECBMITWFyeWxhbmQxEjAQBgNVBAcTCUJhbHRpbW9yZTEpMCcGA1UEChMgU2FtcGxlIFNU
UyAtLSBOT1QgRk9SIFBST0RVQ1RJT04xFjAUBgNVBAsTDUlUIERlcGFydG1lbnQxFDASBgNVBAMT
C3d3dy5zdHMuY29tMRowGAYJKoZIhvcNAQkBFgtzdHNAc3RzLmNvbTAeFw0xMTAyMDkxODM4MTNa
Fw0yMTAyMDYxODM4MTNaMIGpMQswCQYDVQQGEwJVUzERMA8GA1UECBMITWFyeWxhbmQxEjAQBgNV
BAcTCUJhbHRpbW9yZTEpMCcGA1UEChMgU2FtcGxlIFNUUyAtLSBOT1QgRk9SIFBST0RVQ1RJT04x
FjAUBgNVBAsTDUlUIERlcGFydG1lbnQxFDASBgNVBAMTC3d3dy5zdHMuY29tMRowGAYJKoZIhvcN
AQkBFgtzdHNAc3RzLmNvbTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAo+f8gs4WcteLdSPW
Pm8+ciyEz7zVmA7kcCGFQQvlO0smxRViWJ1x+yniT5Uu86UrAQjxRJyANBomQrirfE7KPrnCm6iV
OsGDEntuIZAf7DFPnrv5p++jAZQuR3vm4ZHXFOFTXmI+/FD5AqLfNi17xiTxZCDYyDdD39CNFTrB
2PkCAwEAAaOCARIwggEOMB0GA1UdDgQWBBRa0A38holQIbJMFW7m5ZSw+iVDHDCB3gYDVR0jBIHW
MIHTgBRa0A38holQIbJMFW7m5ZSw+iVDHKGBr6SBrDCBqTELMAkGA1UEBhMCVVMxETAPBgNVBAgT
CE1hcnlsYW5kMRIwEAYDVQQHEwlCYWx0aW1vcmUxKTAnBgNVBAoTIFNhbXBsZSBTVFMgLS0gTk9U
IEZPUiBQUk9EVUNUSU9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW50MRQwEgYDVQQDEwt3d3cuc3Rz
LmNvbTEaMBgGCSqGSIb3DQEJARYLc3RzQHN0cy5jb22CCQD2oVXTNlD4mzAMBgNVHRMEBTADAQH/
MA0GCSqGSIb3DQEBBQUAA4GBACp9yK1I9r++pyFT0yrcaV1m1Sub6urJH+GxQLBaTnTsaPLuzq2g
IsJHpwk5XggB+IDe69iKKeb74Vt8aOe5usIWVASgi9ckqCwdfTqYu6KG9BlezqHZdExnIG2v/cD/
3NkKr7O/a7DjlbE6FZ4G1nrOfVJkjmeAa6txtYm1Dm/f</ds:X509Certificate></ds:X509Data></ds:KeyInfo></ds:Sig
nature><saml2:Subject><saml2:NameID Format="urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified" N
ameQualifier="http://cxf.apache.org/sts">alice</saml2:NameID><saml2:SubjectConfirmation Method="urn:
oasis:names:tc:SAML:2.0:cm:holder-of-key"><saml2:SubjectConfirmationData xsi:type="saml2:KeyInfoConf
irmationDataType"><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:X509Data><ds:X509Cer
tificate>MIIEFjCCA3+gAwIBAgIJAJORWX2Xsa8DMA0GCSqGSIb3DQEBBQUAMIG5MQswCQYDVQQGEwJVUzER
MA8GA1UECBMITmV3IFlvcmsxFjAUBgNVBAcTDU5pYWdhcmEgRmFsbHMxLDAqBgNVBAoTI1NhbXBs
ZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW50MRcw
FQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3DQEJARYRY2xpZW50QGNsaWVudC5jb20w
HhcNMTEwMjA5MTgzMDI3WhcNMjEwMjA2MTgzMDI3WjCBuTELMAkGA1UEBhMCVVMxETAPBgNVBAgT
CE5ldyBZb3JrMRYwFAYDVQQHEw1OaWFnYXJhIEZhbGxzMSwwKgYDVQQKEyNTYW1wbGUgQ2xpZW50
IC0tIE5PVCBGT1IgUFJPRFVDVElPTjEWMBQGA1UECxMNSVQgRGVwYXJ0bWVudDEXMBUGA1UEAxMO
d3d3LmNsaWVudC5jb20xIDAeBgkqhkiG9w0BCQEWEWNsaWVudEBjbGllbnQuY29tMIGfMA0GCSqG
SIb3DQEBAQUAA4GNADCBiQKBgQDauFNVqi4B2+u/PC9ktDkn82bglEQYcL4o5JRUhQVEhTK2iElo
z1Rvo/qyfDhBPc1lzIUn4ams+DKBSSjZMCgop3XbeCXzIVP784ruC8HF5QrYsXUQfTc7lzqafXZX
H8Bk89gSScA1fFme6TpvYzM0zjBETSXADtKOs9oKB2VOIwIDAQABo4IBIjCCAR4wHQYDVR0OBBYE
FFIz+0BSZlLtXkA/udRjRgphtREuMIHuBgNVHSMEgeYwgeOAFFIz+0BSZlLtXkA/udRjRgphtREu
oYG/pIG8MIG5MQswCQYDVQQGEwJVUzERMA8GA1UECBMITmV3IFlvcmsxFjAUBgNVBAcTDU5pYWdh
cmEgRmFsbHMxLDAqBgNVBAoTI1NhbXBsZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU9OMRYw
FAYDVQQLEw1JVCBEZXBhcnRtZW50MRcwFQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3
DQEJARYRY2xpZW50QGNsaWVudC5jb22CCQCTkVl9l7GvAzAMBgNVHRMEBTADAQH/MA0GCSqGSIb3
DQEBBQUAA4GBAEjEr9QfaYsZf7ELnqB++OkWcKxpMt1Yj/VOyL99AekkVTM+rRHCU9Bu+tncMNsf
y8mIXUC1JqKQ+Cq5RlaDh/ujzt6i17G7uSGd6U1U/DPZBqTm3Dxwl1cMAGU/CoAKTWE+o+fS4Q2x
Hv7L1KiXQQc9EWJ4C34Ik45fB6g3DiTj</ds:X509Certificate></ds:X509Data></ds:KeyInfo></saml2:SubjectConfi
rmationData></saml2:SubjectConfirmation></saml2:Subject><saml2:Conditions NotBefore="2013-09-04T07:2
4:29.093Z" NotOnOrAfter="2013-09-04T07:54:29.093Z"><saml2:AudienceRestriction><saml2:Audience>http:/
/localhost:9001/SoapContext/SoapPort</saml2:Audience></saml2:AudienceRestriction></saml2:Conditions>
<saml2:AttributeStatement><saml2:Attribute Name="token-requestor" NameFormat="http://cxf.apache.org/
sts"><saml2:AttributeValue xsi:type="xs:string">authenticated</saml2:AttributeValue></saml2:Attribut
e></saml2:AttributeStatement></saml2:Assertion><xenc:EncryptedKey xmlns:xenc="http://www.w3.org/2001
/04/xmlenc#" Id="EK-FDAAB3AADBF82F327813782794693427"><xenc:EncryptionMethod Algorithm="http://www.w
3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wss
e:SecurityTokenReference><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>1.2.840.113549.1.9.1=#
16137365727669636540736572766963652e636f6d,CN=www.service.com,OU=IT Department,O=Sample Web Service
Provider -- NOT FOR PRODUCTION,L=Buffalo,ST=New York,C=US</ds:X509IssuerName><ds:X509SerialNumber>13
439384057678826227</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></wsse:SecurityTokenRefe
rence></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>AdXYXvDA41S0sKPfP06XKWjP9AgYcNvcQrbIXxjs/5GuLa
jEsWGM2WCfQuYBpaK/g2457q8BVuI3qUXlSMB6lP8P4Sg6gSDRQi8ADQDPbIKJ5F+BHudgEFF1FueYv5pEcglhcCdgSxRDY3Xbkn
x0wUaO3uBGtoY6QiqtzOQ9N3U=</xenc:CipherValue></xenc:CipherData><xenc:ReferenceList><xenc:DataReferen
ce URI="#ED-11"/></xenc:ReferenceList></xenc:EncryptedKey><ds:Signature xmlns:ds="http://www.w3.org/
2000/09/xmldsig#" Id="SIG-10"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org
/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" P
refixList="soap"/></ds:CanonicalizationMethod><ds:SignatureMethod Algorithm="http://www.w3.org/2000/
09/xmldsig#rsa-sha1"/><ds:Reference URI="#TS-9"><ds:Transforms><ds:Transform Algorithm="http://www.w
3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14
n#" PrefixList="wsse soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3
.org/2000/09/xmldsig#sha1"/><ds:DigestValue>jNMmIt5rJhkx8fAvb1fT1g7PUCU=</ds:DigestValue></ds:Refere
nce><ds:Reference URI="#Id-2920740"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/1
0/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixLi
st=""/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#
sha1"/><ds:DigestValue>P0xB0rOM85V8w2yFDjfz2bHfGdM=</ds:DigestValue></ds:Reference><ds:Reference URI
="#Id-32299982"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec
:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Tran
sform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:Diges
tValue>rSbepXB/9SAWI0PFLEWVwhe+Hmo=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-22202345">
<ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamesp
aces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Trans
forms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>DEPHHvvus
/tCTTdik5mxt7r3wXE=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-29538465"><ds:Transforms><
ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="h
ttp://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Transforms><ds:Digest
Method Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>I4BSYAIVQhNmmQSkkdOXwTJME
3M=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-15165035"><ds:Transforms><ds:Transform Alg
orithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org
/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm
="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>i/8tT8/OzpXWTESAlRZDRu716Ec=</ds:DigestVa
lue></ds:Reference></ds:SignedInfo><ds:SignatureValue>h4rrUGAqdYYV3KvuRoejKEq/jNwu0G8K9DMrzN8WsNp2tM
Ebuk56jwDpZ8v22HwMgAlcuTNKl5oeWd15utlOSFHxDZQ07hYsN4S2BevcKuECJU5g1Zq7JpBnRVkiybxQxKVFhET30YBW55qLnL
it/UjdOOtUhhngHfuHDlufjGU=</ds:SignatureValue><ds:KeyInfo Id="KI-FDAAB3AADBF82F327813782794693276"><
ns3:SecurityTokenReference xmlns:ns3="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecu
rity-secext-1.0.xsd" xmlns:wsse11="http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xs
d" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV2.0"><ns3:
KeyIdentifier ValueType="http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID">_CE
19E68ECA663EC06213782794690301</ns3:KeyIdentifier></ns3:SecurityTokenReference></ds:KeyInfo></ds:Sig
nature></wsse:Security></soap:Header><soap:Body xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oa
sis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-2920740"><xenc:EncryptedData xmlns:xenc="http:
//www.w3.org/2001/04/xmlenc#" Id="ED-11" Type="http://www.w3.org/2001/04/xmlenc#Content"><xenc:Encry
ptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="http://ww
w.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-open.org/wss/2
004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsse11="http://docs.oasis-open.org/wss/oasi
s-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-soap-mes
sage-security-1.1#EncryptedKey"><wsse:Reference URI="#EK-FDAAB3AADBF82F327813782794693427"/></wsse:S
ecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>YLQPCF7S2gVJSrBfw488UXeoc5xWiW
Qu8oTWw9N3BYbdykgGwu/IGQbBe0unh4xENXlIihhB60zF7iikp9fBV2ocnupOYevBPuyHj0WMzncEhearNKPkRoL0LtgapRAR/L
XtYWYtexIkB63Zv7Ie2p8cI8dLLbJohzsEdNasBtE=</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData>
</soap:Body></soap:Envelope>
--------------------------------------
九月 04, 2013 3:24:30 下午 demo.wssec.server.GreeterImpl greetMe
INFO: Executing operation greetMe
Executing operation greetMe
Message received: dell

九月 04, 2013 3:24:30 下午 org.apache.cxf.services.SOAPService.SoapPort.Greeter
INFO: Outbound Message
---------------------------
ID: 1
Encoding: UTF-8
Content-Type: text/xml
Headers: {}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-26845597">http://apache.org/hello_world_soap_http
/Greeter/greetMeResponse</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="
http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-45281
42">urn:uuid:1209e86e-0b79-4d44-819b-15a89eb0b8b5</MessageID><To xmlns="http://www.w3.org/2005/08/ad
dressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.
xsd" wsu:Id="Id-27888759">http://www.w3.org/2005/08/addressing/anonymous</To><RelatesTo xmlns="http:
//www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-
wssecurity-utility-1.0.xsd" wsu:Id="Id-3038206">urn:uuid:06f41687-bec5-4169-b107-e79efe69e243</Relat
esTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-s
ecext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility
-1.0.xsd" soap:mustUnderstand="1"><wsse:BinarySecurityToken EncodingType="http://docs.oasis-open.org
/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary" ValueType="http://docs.oasis-o
pen.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3" wsu:Id="0A0326FD1A345C05D6137827
94704345">MIIEFjCCA3+gAwIBAgIJAJORWX2Xsa8DMA0GCSqGSIb3DQEBBQUAMIG5MQswCQYDVQQGEwJVUzERMA8GA1UECBMITm
V3IFlvcmsxFjAUBgNVBAcTDU5pYWdhcmEgRmFsbHMxLDAqBgNVBAoTI1NhbXBsZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU
9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW50MRcwFQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3DQEJARYRY2xpZW50QG
NsaWVudC5jb20wHhcNMTEwMjA5MTgzMDI3WhcNMjEwMjA2MTgzMDI3WjCBuTELMAkGA1UEBhMCVVMxETAPBgNVBAgTCE5ldyBZb3
JrMRYwFAYDVQQHEw1OaWFnYXJhIEZhbGxzMSwwKgYDVQQKEyNTYW1wbGUgQ2xpZW50IC0tIE5PVCBGT1IgUFJPRFVDVElPTjEWMB
QGA1UECxMNSVQgRGVwYXJ0bWVudDEXMBUGA1UEAxMOd3d3LmNsaWVudC5jb20xIDAeBgkqhkiG9w0BCQEWEWNsaWVudEBjbGllbn
QuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDauFNVqi4B2+u/PC9ktDkn82bglEQYcL4o5JRUhQVEhTK2iEloz1Rvo/
qyfDhBPc1lzIUn4ams+DKBSSjZMCgop3XbeCXzIVP784ruC8HF5QrYsXUQfTc7lzqafXZXH8Bk89gSScA1fFme6TpvYzM0zjBETS
XADtKOs9oKB2VOIwIDAQABo4IBIjCCAR4wHQYDVR0OBBYEFFIz+0BSZlLtXkA/udRjRgphtREuMIHuBgNVHSMEgeYwgeOAFFIz+0
BSZlLtXkA/udRjRgphtREuoYG/pIG8MIG5MQswCQYDVQQGEwJVUzERMA8GA1UECBMITmV3IFlvcmsxFjAUBgNVBAcTDU5pYWdhcm
EgRmFsbHMxLDAqBgNVBAoTI1NhbXBsZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW
50MRcwFQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3DQEJARYRY2xpZW50QGNsaWVudC5jb22CCQCTkVl9l7GvAzAMBg
NVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4GBAEjEr9QfaYsZf7ELnqB++OkWcKxpMt1Yj/VOyL99AekkVTM+rRHCU9Bu+tncMN
sfy8mIXUC1JqKQ+Cq5RlaDh/ujzt6i17G7uSGd6U1U/DPZBqTm3Dxwl1cMAGU/CoAKTWE+o+fS4Q2xHv7L1KiXQQc9EWJ4C34Ik4
5fB6g3DiTj</wsse:BinarySecurityToken><wsu:Timestamp wsu:Id="TS-1"><wsu:Created>2013-09-04T07:24:30.4
19Z</wsu:Created><wsu:Expires>2013-09-04T07:29:30.419Z</wsu:Expires></wsu:Timestamp><xenc:EncryptedK
ey xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="EK-0A0326FD1A345C05D613782794704344"><xenc:Enc
ryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/><ds:KeyInfo xmlns:ds="htt
p://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference><wsse:Reference URI="#0A0326FD1A345C05
D613782794704345" ValueType="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-prof
ile-1.0#X509v3"/></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>zQhl/
Nlgcv6EAqHAiQHXSYWYA/1PK/uq4m/VMik2E8/IOVIzewrj3LVlfS+4VU94JWChRvoV6ZRgBaxRRaXrcIAaxrKoxMF3GDmJb1FYS
o8kcJZBgAEGYGaArGFFTTkavCLHnSxuI8E9xs/Rb+qs0bcfcNpub5/16+4IesDzMDM=</xenc:CipherValue></xenc:CipherD
ata><xenc:ReferenceList><xenc:DataReference URI="#ED-3"/></xenc:ReferenceList></xenc:EncryptedKey><d
s:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#" Id="SIG-2"><ds:SignedInfo><ds:Canonicaliza
tionMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="htt
p://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:CanonicalizationMethod><ds:SignatureMe
thod Algorithm="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/><ds:Reference URI="#TS-1"><ds:Transform
s><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec
="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="wsse soap"/></ds:Transform></ds:Transforms><d
s:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>MvT8jhYw+XJdprG3r
x1gXZuO3lk=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-28117745"><ds:Transforms><ds:Trans
form Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://ww
w.w3.org/2001/10/xml-exc-c14n#" PrefixList=""/></ds:Transform></ds:Transforms><ds:DigestMethod Algor
ithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>htzvuvx3W7mcji00ucJrh47/BuU=</ds:Dige
stValue></ds:Reference><ds:Reference URI="#Id-27888759"><ds:Transforms><ds:Transform Algorithm="http
://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml
-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www
.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>7Dj8cB+hWMkAVDBjaEi889hqZuA=</ds:DigestValue></ds:Ref
erence><ds:Reference URI="#Id-4528142"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/200
1/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" Prefi
xList="soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/x
mldsig#sha1"/><ds:DigestValue>A2QtcGfn73JPvjnnuccCDJenQuU=</ds:DigestValue></ds:Reference><ds:Refere
nce URI="#Id-3038206"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n
#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></d
s:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds
:DigestValue>z2ExQG5GM0PQJzBCA+ukDvF4PuE=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-2684
5597"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:Inclusive
Namespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds
:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>ZT5
WwfBEQaLUuBhZg+IV8EOyaVA=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ihGRpP+P
f/A6d+3kMtBinMlRyJ5CwSiiiAo2I7C/QB1YU8YHK9gX4KjhukpCY1Q84kReCxRRkr6GHlu5H5779p6RzDpWr5D8M4efMH8X4b1T
BLXGAsQd5g6Pw8XPWOL4pgFBt2vXiXBAR8T2xCyUYoJ9QZHpiwq1jwF/z279n3E=</ds:SignatureValue><ds:KeyInfo Id="
KI-0A0326FD1A345C05D613782794704192"><wsse:SecurityTokenReference wsu:Id="STR-0A0326FD1A345C05D61378
2794704193"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>1.2.840.113549.1.9.1=#1613736572766
9636540736572766963652e636f6d,CN=www.service.com,OU=IT Department,O=Sample Web Service Provider -- N
OT FOR PRODUCTION,L=Buffalo,ST=New York,C=US</ds:X509IssuerName><ds:X509SerialNumber>134393840576788
26227</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></wsse:SecurityTokenReference></ds:Ke
yInfo></ds:Signature></wsse:Security></soap:Header><soap:Body xmlns:wsu="http://docs.oasis-open.org/
wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-28117745"><xenc:EncryptedData xm
lns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="ED-3" Type="http://www.w3.org/2001/04/xmlenc#Conten
t"><xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns
:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-
open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsse11="http://docs.oasis-ope
n.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oasi
s-wss-soap-message-security-1.1#EncryptedKey"><wsse:Reference URI="#EK-0A0326FD1A345C05D613782794704
344"/></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>F5zZ6Njp3F5v+4Yl
WSe+yx/zHkK0WUMtKK5tgY9aPlVlVVXUWdJ0tCytUU86Iz4tQS6bAcgwawBuvjAt7ftYUH0WsPwz2xopmJ5SAjQVslphfwMMirKL
0Z4+rdhfbTtyatRDvJdVif60NsdIS0mwLMDbtenQg66m+RnqBqQavRYbsc413dc6RzfkNmyhVzvd0TUVtDVcPFTgubNQiW2C1Q==
</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData></soap:Body></soap:Envelope>
--------------------------------------

------------------------------------------------------------------------





client
------------------------------------------------------------------------

F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts>mvn -Pclient
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building CXF STS Demo 2.7.6
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- cxf-codegen-plugin:2.7.6:wsdl2java (generate-sources) @ sts ---
[INFO]
[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ sts ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 6 resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ sts ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ sts ---
[debug] execute contextualize
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts\src\test\res
ources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ sts ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ sts ---
[INFO] No tests to run.
[INFO] Surefire report directory: F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts\target\surefire-repor
ts

-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] >>> exec-maven-plugin:1.2:java (default) @ sts >>>
[INFO]
[INFO] <<< exec-maven-plugin:1.2:java (default) @ sts <<<
[INFO]
[INFO] --- exec-maven-plugin:1.2:java (default) @ sts ---
九月 04, 2013 3:24:25 下午 org.springframework.context.support.AbstractApplicationContext prepareRef
resh
INFO: Refreshing org.apache.cxf.bus.spring.BusApplicationContext@4e49f: startup date [Wed Sep 04 15:
24:25 CST 2013]; root of context hierarchy
九月 04, 2013 3:24:25 下午 org.apache.cxf.bus.spring.BusApplicationContext getConfigResources
INFO: Loaded configuration file file:/F:/java/lib/cxf/apache-cxf-2.7.6/samples/sts/target/classes/ws
sec-client.xml.
九月 04, 2013 3:24:25 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDef
initions
INFO: Loading XML bean definitions from class path resource [META-INF/cxf/cxf.xml]
九月 04, 2013 3:24:25 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDef
initions
INFO: Loading XML bean definitions from URL [file:/F:/java/lib/cxf/apache-cxf-2.7.6/samples/sts/targ
et/classes/wssec-client.xml]
九月 04, 2013 3:24:25 下午 org.springframework.beans.factory.support.DefaultListableBeanFactory preI
nstantiateSingletons
INFO: Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanF
actory@a272b0: defining beans [cxf,org.apache.cxf.bus.spring.BusWiringBeanFactoryPostProcessor,org.a
pache.cxf.bus.spring.Jsr250BeanPostProcessor,org.apache.cxf.bus.spring.BusExtensionPostProcessor,cxf
.config0,{http://apache.org/hello_world_soap_http}SoapPort.jaxws-client.proxyFactory,{http://apache.
org/hello_world_soap_http}SoapPort.jaxws-client]; root of factory hierarchy
九月 04, 2013 3:24:25 下午 org.apache.cxf.service.factory.ReflectionServiceFactoryBean buildServiceF
romWSDL
INFO: Creating Service {http://apache.org/hello_world_soap_http}SOAPService from WSDL: file:/F:/java
/lib/cxf/apache-cxf-2.7.6/samples/sts/wsdl/hello_world.wsdl
Invoking greetMe...
九月 04, 2013 3:24:27 下午 org.apache.cxf.services.SecurityTokenService.UT_Port.STS
INFO: Outbound Message
---------------------------
ID: 1
Address: http://localhost:8080/SecurityTokenService/UT
Encoding: UTF-8
Http-Method: POST
Content-Type: text/xml
Headers: {Accept=[*/*], SOAPAction=["http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue"]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-16190602">http://docs.oasis-open.org/ws-sx/ws-tru
st/200512/RST/Issue</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http:
//docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-30540747">
urn:uuid:e53e140a-3ace-41b7-9181-dbb39ac13a6f</MessageID><To xmlns="http://www.w3.org/2005/08/addres
sing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
 wsu:Id="Id-25095750">http://localhost:8080/SecurityTokenService/UT</To><ReplyTo xmlns="http://www.w
3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecur
ity-utility-1.0.xsd" wsu:Id="Id-5062832"><Address>http://www.w3.org/2005/08/addressing/anonymous</Ad
dress></ReplyTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-w
ssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecur
ity-utility-1.0.xsd" soap:mustUnderstand="1"><wsu:Timestamp wsu:Id="TS-1"><wsu:Created>2013-09-04T07
:24:27.361Z</wsu:Created><wsu:Expires>2013-09-04T07:29:27.361Z</wsu:Expires></wsu:Timestamp><xenc:En
cryptedKey xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="EK-FDAAB3AADBF82F327813782794675481"><
xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/><ds:KeyInfo xmlns
:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-
open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:KeyIdentifier EncodingType="h
ttp://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary" Value
Type="http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#ThumbprintSHA1">l38MHAoulTT
TEKjgU4D1ZTUkyj8=</wsse:KeyIdentifier></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><x
enc:CipherValue>UFELzyvp7dQc4dJlQFgzt8wW0oCoIISMm40X2g81oYhpplmwP1rEorVfi5dWwKrkPSjYaxeOct6Esmsa60xX
YkZMQbsoeilKKMl2VZQEvxjDE0PZf0iwx9Bd6vomtEDV/KpaQo3cqJaBxnX2052tEKMnOKvfM9w9Ulyssa0074E=</xenc:Ciphe
rValue></xenc:CipherData></xenc:EncryptedKey><wsc:DerivedKeyToken xmlns:wsc="http://docs.oasis-open.
org/ws-sx/ws-secureconversation/200512" wsu:Id="DK-3"><wsse:SecurityTokenReference xmlns:wsse11="htt
p://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis
-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey" wsu:Id="STR-FDAAB3AADBF82F3278137827
94676422"><wsse:Reference URI="#EK-FDAAB3AADBF82F327813782794675481" ValueType="http://docs.oasis-op
en.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey"/></wsse:SecurityTokenReference><wsc:Off
set>0</wsc:Offset><wsc:Length>24</wsc:Length><wsc:Nonce>xO9pBniz/41UuHl2igMLDA==</wsc:Nonce></wsc:De
rivedKeyToken><wsc:DerivedKeyToken xmlns:wsc="http://docs.oasis-open.org/ws-sx/ws-secureconversation
/200512" wsu:Id="DK-5"><wsse:SecurityTokenReference xmlns:wsse11="http://docs.oasis-open.org/wss/oas
is-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-soap-me
ssage-security-1.1#EncryptedKey" wsu:Id="STR-FDAAB3AADBF82F327813782794676895"><wsse:Reference URI="
#EK-FDAAB3AADBF82F327813782794675481" ValueType="http://docs.oasis-open.org/wss/oasis-wss-soap-messa
ge-security-1.1#EncryptedKey"/></wsse:SecurityTokenReference><wsc:Offset>0</wsc:Offset><wsc:Length>3
2</wsc:Length><wsc:Nonce>3QuNdFdgE7WlulThPWWWTQ==</wsc:Nonce></wsc:DerivedKeyToken><xenc:ReferenceLi
st xmlns:xenc="http://www.w3.org/2001/04/xmlenc#"><xenc:DataReference URI="#ED-6"/><xenc:DataReferen
ce URI="#ED-7"/><xenc:DataReference URI="#ED-8"/></xenc:ReferenceList><xenc:EncryptedData xmlns:xenc
="http://www.w3.org/2001/04/xmlenc#" Id="ED-8" Type="http://www.w3.org/2001/04/xmlenc#Element"><xenc
:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="htt
p://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-open.org
/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Reference URI="#DK-5" ValueType="http
://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></wsse:SecurityTokenReference></ds:Ke
yInfo><xenc:CipherData><xenc:CipherValue>VxGyOlk8qdslh8q+PhxVQyiFIpbXddd4jy8GULBZTARKzTOXn99wevILoKE
5eSF4s5MnWWZjfJ/KOLB5JFq1mbE6PCysk7IyQc8ExYRqTdCwZ87b9keAdVSHsR1cS1Yc9Ib4I8WCmGWWR5lMYSM7p/lYgWAxlQO
EvXKBrUpU+TWjHFWKIZa5YWcsbaJ3JMquSpIZwVdeCulcYzWPkIq5d06Pe/K5kfZHyRlr78GhHFuV+tyqXezzXxs4t4KDPcgzDlp
h2bJVeB1cbMZAlzL9V6axB5x4zPH4tH88QrKfcXV99vOxQi+HS0A+hm1On2u5hnfR60Zy5CutX9DUsKp4qTqcdf4o1tR4QfaWvTA
J1mA=</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData><xenc:EncryptedData xmlns:xenc="http:
//www.w3.org/2001/04/xmlenc#" Id="ED-7" Type="http://www.w3.org/2001/04/xmlenc#Element"><xenc:Encryp
tionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="http://www
.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-open.org/wss/20
04/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Reference URI="#DK-5" ValueType="http://docs
.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></wsse:SecurityTokenReference></ds:KeyInfo><
xenc:CipherData><xenc:CipherValue>AmW+7k1JBjg/W2UKYvDAMVt0FdreNmgude2a68F28/WRYMhGuyNK0kAnJmBxHqgr6u
mB/8VZ1MXYPqoFdpAMMefME71n2VKMQHDEn4611T4Gz4bRaUQfaA1JNial3Z1lrOF4UF5spaybRSabT0WBGmc1bk11vSMI3VT4qs
GkiqL/b6lyNRHUDHCWcdDWXjRDnA3GmFEX5Vd4Hh2gaZ1zHoO9RlOCQW6RyydpFe3jSCXDElYMHOpxdVEVU+M7brxS+Wk6SWgcoL
MmdhGrgQ0F4dRoprgQjy08S0IWrBKeJnDOjdCK+yAqZGy44JRkUoPU0z2Ce/ajWl+UchyDYvmHOX7rUwCqkKx+nNCiDhrD3wz+1L
e0LUf4P+GjD5kdRK/QpC3tDrymaimiwXl41m5SQLh6jKT3cRbm+b67ANUZflf3tqUBLYu3H5q6WM/qB1fgkeNfzVhNCPBd8yr0XR
nkrPpaLbk/L2GrEA0FPVvijzzTZXdvu7d6glBRhug3Ubal7/WUHVclfEBwgFXQwPbA2yXaHusbQj8y8iowFLhOpdmm0iYiMWAJ0s
6tVSbyNv0KAKzf11Y2nLTGTbhs6kLciySr9hmb0hik8uHLozTYyBcccuaXfKQ/RPkZUBjniOJEnm7T5RuVQn7vszHg6MxIKTE8pu
4seq2bRcLOPGazKTyagGx8g+0ohuW1XDriUdi1p8/S4yX1Bowdj/it/gRBjVyD9NlbZXExUAY0NAjbQjdUZVCU5dZTAa47N3yn3b
x+zpyaGypzOhD234Mb9zzTt4yRx9mDmzhFxje+tb9VSpq0wDWwX0NAXS8FknWHUewOL0SzV7oNuAGBeZnPieBLn5uXOicoiLrysr
A4k7iT3Qz9DZ2v0jWU5u/4kMM8IuDPBb91a+xc24CX4xsosYQIDkLp9xFsj40fZNlrIwU5TskDhruGZjbC6yTI8wNh7kBmNlIxOo
h41mATbB5ssq92DwVVp7cpwIecrfeTWQ7HcsoYNbmiXGiMuBXNOmHy30FWkrwgaIgAgQR3hjt7Ojz2BP0nDXuBpHBYmL3Co/yCEQ
9qwAVLlu64yvWN4kVXyMnpN+Du2qRfEoGZJgaAC3KP7UXXJBkzqfYwci2m218zUarWZGG0O+9zSDkTGb3mcqcH70bFiIfZsNPDlm
X7SVzOedsjFFkfA4b9ofMC2gy78JlXA3sbHcWhb/9NN15BiW/QnysC6zOXddpdhV3kpTLimKiS3IPXUUwxR5kjZudXF6WR9+lc3I
HNAN5l1qenW3FAy5qIRbBGVocExd9LufUbZO25Ou14yBeCtlI6/DwRaFWxQetRfCHi2UPNBTkGublnLIwnToQzy3PyQiep62MgC/
2rSvKcSYkO/hZKgZjnO6ad+GofsNbaCRaO3TfAh4gz6pFznvLs6COT9NzyuFVbDkF6FeX01MpdgNiaPVTh8we8GdNLq+/ZEQEhgV
rXqY9MrKFNQJo14SuSdykhqPIHvSn2avtXbgeZTThpX0WYzUDE7kSMrMtf8nj8Y/RvcYZuDzflweZCBnzkOwO4FCwY0rX7wJUZZZ
HSVbpGWKxsyfqipLQ4Bn5USLo1nhObApHcaKT+aqUW6zRxgki4judwiBtBVtJSfI5dX7vXj7WkR3Ug3j1rJcJ68pbl1V69iKFBbz
JA/OflCt0gmrHRcJ/Xx7aEZ/0qxghW6zkkLtD/o5Eqjz9Q9bMOAH1HgnHW3qK0ys8GLhjNz7oZQj9cHIqMFT6qlf8mU1dcMouV+N
G9xyOkbnnX+WS3mb1ci0TcoW176MGJgAA7afsy16h/bn0f7Y+vQ4Lrnldr8QcNJ1qj8ZN3UuFKsd46JOdo5pEHuHOsaKyS9fBRZr
9qyOqmcAXq/g70ullGzuSZEUEkvwTEMQZ0WGY88FLKZ/016afNhzZngD/T3duN2KiiKfFgw0m1CNxTHej/Gq3Z5y8y63vmoTqzaY
CwyB/+r3Z2KTnARx+l+feKhiAl/RncA9GwU0YGjHUL9ltiMux+zTbppXYSSE5lDisjC7m8+c7gXgZCIBFd2rBi4kwnGiWnb7shby
XfX6SYdAr/0+nKxALlkG5WR8O2GUa749KuVKocgupQHVkXCvNb2Bs6CU9JikUWdLdSd28U8YtFZaqkW2tsGqVFyK8JeJRcUh94oY
k7eYpLJ66G5oks5cmyVZnnD8fjhorrx/PGcwZFBNrrPlOqGS+QYsQ4kDRcY150JzHPoAiPRMhmoySusmjyEsjv0p2IxGzwjbjLGY
5BhypjlmahWjpuqXbkuY8+w/DAlixT+NPnlIERSnKbTMxie57vtMebKrMThzDONJQgxSGodOTNkmAO89WB7rH2SW+ZoXgzrxWjOS
k3bzN2Er+3IL/TvUvorFvNDpYMqpI9ebQwnx5vB7+uJWxQE5vXjMfh8e76gTMykHfOF3FyYt90T720cRN4XrrSc2edgjBLVCSdm8
ox2YqqRpMqursuD32ARLw0ewBNhdN6mZmgkf0/kqfE6h7Li3wva6uksQKntxnz0ZrM/2IPWtSwt3lML3rUbpSptj9DHTqJ4S1AvO
snK7JD13E9LvfFA/WrF7KAd5VG4+/wrpgCSNf6fYa6WKmNhpL3Ngjrwul+VaNi7yFgvtwOSDvlm2ro2i2z42wQdGXq/kwqGBceU2
1CyPJKdLZZ+jbyvNY1Ul4ofagpZrxBw1EMWIcyTZMhoPUnzuzSvE/FVQ58A/jXfKPZWnypukfWzWE+4O5fKG9gLxeUG6pqIKs677
0/mjhzSgbtiDjozj/dzsi+5DFaldwXPWwuoShPqPpRXj9Zwv8Ew9Qbno2iUX35AaVJYJOSkv40ICoLpQTg3WLQZ1oiiS7wCpd1uX
mYx9/hGEV1ZmBSau0mUOaEmg/hQmECz/rkB84pm6ZhaCghsbTUnvGjO0GnYsmADvU7B1VkxClK/zv2J32O7t2nKx19eQQSnLn9zn
mm3s1Z6v5fpgSmlVIDqoz2njK8Aqv5o93r1/LpJ9OdRUgOeeFG/xjtZlymNI9pJZio4aY/YdoNpof6aL7IeOjT5PqDJVn0MAQat9
NkZGaR2DiWlxigb7BKR8fSglGv0R6VVru5Z/wf80pAKmpWYihWb6AGPH4HF49RkwFsn5GSOi1KgMdqVsZSwQbltEZgi5Xd7SM1V8
7C38Bb2KhRCZ5piKf51oP6ZSJNfwjmaIoPHgR/COycdFBt6OmRxgQQp5MWcLOriq0cjPJj6dfnJiICM2qPaZxRBG/Rdggjrf/2xw
WSXloc4y5V/CzaNTeKhXLtJItHpgHJqh/o7bDa0ps5zzXeArXfWmOT5EpsT5tb+56Pbfkl+oA2Jos2B+oLUcN+LrXwqOnuEguxac
33B7VGEtY92Tzi4gVtt+bJi9YuB7SzEtto49j8XRmFNKRdTOj5wYekuiDWZFGJVVH4vXmUslJ2BTQ9P/qnXUOzUREfQ/PYWKEhso
QTOhxfsxxpv5MQ/URSRPKD58ik3uemWdB7ijzySq3+/pXP4XARmtcd2GSt17halmPuWxigISjkjgOpEK9DbF+hGNq97TRFFUyfL/
gue0rspGPC6lPLep8OIi56EFh/mZMAwmGhcofiJVTFffvPcZRAwdaFfG7Y56lqH4+/VH+iUvcRKNXEWJZWslwmy2g5QocoQ0TlMf
hQR8/Lt+WlzCs+Br6sZrgwWIgL66T/OTD9GNkcTlEiJjiCz82k5nlWX1SRx0CE8iZeOg8Y4DfGL0uNsIPt88GshY3m592/YJhCRN
cgonbAnpRxIPwOYDkrlWtCoBwOs6uD+I6XQARXND2E9BxSTf+63Qzxec8/FreT4lI6OmBYCqHxO50nEz/ovNn9RPs1izsI2tI8yk
D/AxYylU4vbmXu+8roe2bfZHada6ZrZb0A1ywMzH1mtURoDKIMRxDLo7IUoTTAUUeTl45ICySl03gqa/BkPZPRh6Gtkii2I6EPjF
GMrzxLo9GLj58f8iO8Vhj/q31dVZrEWK1ckOM6ZBg2+b5qfG9eKfqG5kv0x3HXpHztZxw070rTmzR0hHuCrCr5kJsR9ljm1d3iIx
yTB4JV0gO89/XSblGSQhLOk0PAx2+EMJaJDd8Tet4LNfu17mVSruujf1FufUjKRk55fIZ/V19dasGnvoeL0f7U8/goGqlVgDpSjy
BY6VvttFgO2ZoiW9+xEguFtZyexSVsSpYRMkIT4ofQWWmxl8LrEofdO8eG6GvH/ZWhR3lLbT+3Qv3X9ifdKrOPrp1zne+/JvVezU
8ANzQUI93H5yU0cI4mNATjr3pnQHAAxH//oyNaoyRQ5ADlJsyFNwCD7p/l/yvNFL+HEtB8zaE0opTwO8dF6dgJjmEsgQLqfI4TL3
LksCZ7o6xRODf+aBkeIcQlfmPRLiP/Q7duA0VddOhIHgIPKfoS+a2FxBZgntQclbqhPDITs5YAKylZGDuTZqAYpZD2bb9Ff+3TI1
6cLyqGcJ/jDdXkS/YpWqXtNIRi413BN0glGNiOtU8C1tAVgEMeDIhmN+fOcfyaSXWYfhyx+K7u+JixPeQhA9p4FcI4hOW2c+JdhV
I7/8+pD++ZUcC8G40nW4GWdc746dE7bIA124tuYr0/rh1JyZ2CQ+pzklgyZCV7C5gTmSwJmnIyhjBngjkmi1W35d03Il4GSkWxig
fiXO6jAYFY7Wfh/JpJOBjbEs+VPi5wRBuwm3C9svW0B/ximge/MCii6SbhQsgZN2P+CyPnyZEK9dq2VdAQPQrOVaNYqOl0KoiNHN
MB4eNLoNLlpI9zcpJEDOFOFlH3ha6zqYp1UFLFXe+FucITRSShJoR+s5EiV8vd8LrvJ857sSYdhgY8rdrLCYTQlOp3RLodQwzU6A
MEnt8NQrnC/xCHJi/QinUat7ebTKs6vdaWi24QClqyiCe20eai3oE4kmFoTE5KwQNrDm6mNSmqK9v4FYR4LKbcdYV9bKmj2TA1ZC
RbW3OPzzv++Jzeju8z5MVGpFOBqmFPoEcq0jo/UUwrt4Gf5jEjYqWTLDzQG0OzFWRsB4qPESZv961fTmcNLVrfRA50</xenc:Cip
herValue></xenc:CipherData></xenc:EncryptedData></wsse:Security></soap:Header><soap:Body xmlns:wsu="
http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-17783
924"><xenc:EncryptedData xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="ED-6" Type="http://www.w
3.org/2001/04/xmlenc#Content"><xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes
256-cbc"/><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xml
ns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Re
ference URI="#DK-5" ValueType="http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></
wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>KQ1jaDGc09yPAls7EcHC///k
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
Y2E8m3hq4h8w3l2Bjk4=</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData></soap:Body></soap:Env
elope>
--------------------------------------
九月 04, 2013 3:24:29 下午 org.apache.cxf.services.SecurityTokenService.UT_Port.STS
INFO: Inbound Message
----------------------------
ID: 1
Response-Code: 200
Encoding: UTF-8
Content-Type: text/xml;charset=UTF-8
Headers: {content-type=[text/xml;charset=UTF-8], Server=[Jetty(8.1.7.v20120910)], transfer-encoding=
[chunked]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-8679710">http://docs.oasis-open.org/ws-sx/ws-trus
t/200512/RSTRC/IssueFinal</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu=
"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-2954
5751">urn:uuid:d1f91305-ab6a-491b-9b8f-7bf26907e330</MessageID><To xmlns="http://www.w3.org/2005/08/
addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.
0.xsd" wsu:Id="Id-20359617">http://www.w3.org/2005/08/addressing/anonymous</To><RelatesTo xmlns="htt
p://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-ws
s-wssecurity-utility-1.0.xsd" wsu:Id="Id-3410462">urn:uuid:e53e140a-3ace-41b7-9181-dbb39ac13a6f</Rel
atesTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity
-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utili
ty-1.0.xsd" soap:mustUnderstand="1"><wsu:Timestamp wsu:Id="TS-1"><wsu:Created>2013-09-04T07:24:29.18
6Z</wsu:Created><wsu:Expires>2013-09-04T07:29:29.186Z</wsu:Expires></wsu:Timestamp><wsc:DerivedKeyTo
ken xmlns:wsc="http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512" wsu:Id="DK-2"><wsse:Se
curityTokenReference xmlns:wsse11="http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xs
d" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKey
"><wsse:KeyIdentifier EncodingType="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-mes
sage-security-1.0#Base64Binary" ValueType="http://docs.oasis-open.org/wss/oasis-wss-soap-message-sec
urity-1.1#EncryptedKeySHA1">GiW8lcRPF3olh8RBOh7yA8e5R34=</wsse:KeyIdentifier></wsse:SecurityTokenRef
erence><wsc:Offset>0</wsc:Offset><wsc:Length>24</wsc:Length><wsc:Nonce>E3Y+BTakGrsaAJnvm5hDjA==</wsc
:Nonce></wsc:DerivedKeyToken><wsc:DerivedKeyToken xmlns:wsc="http://docs.oasis-open.org/ws-sx/ws-sec
ureconversation/200512" wsu:Id="DK-4"><wsse:SecurityTokenReference xmlns:wsse11="http://docs.oasis-o
pen.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oa
sis-wss-soap-message-security-1.1#EncryptedKey"><wsse:KeyIdentifier EncodingType="http://docs.oasis-
open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary" ValueType="http://docs
.oasis-open.org/wss/oasis-wss-soap-message-security-1.1#EncryptedKeySHA1">GiW8lcRPF3olh8RBOh7yA8e5R3
4=</wsse:KeyIdentifier></wsse:SecurityTokenReference><wsc:Offset>0</wsc:Offset><wsc:Length>32</wsc:L
ength><wsc:Nonce>/EaM69Yfol4Dq+l6kUQO5g==</wsc:Nonce></wsc:DerivedKeyToken><xenc:ReferenceList xmlns
:xenc="http://www.w3.org/2001/04/xmlenc#"><xenc:DataReference URI="#ED-5"/><xenc:DataReference URI="
#ED-6"/></xenc:ReferenceList><xenc:EncryptedData xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="
ED-6" Type="http://www.w3.org/2001/04/xmlenc#Element"><xenc:EncryptionMethod Algorithm="http://www.w
3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:Se
curityTokenReference xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-
secext-1.0.xsd"><wsse:Reference URI="#DK-4" ValueType="http://docs.oasis-open.org/ws-sx/ws-securecon
versation/200512/dk"/></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>
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</xenc:CipherValue><
/xenc:CipherData></xenc:EncryptedData></wsse:Security></soap:Header><soap:Body xmlns:wsu="http://doc
s.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-12706655"><xenc
:EncryptedData xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="ED-5" Type="http://www.w3.org/2001
/04/xmlenc#Content"><xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/>
<ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="h
ttp://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"><wsse:Reference UR
I="#DK-4" ValueType="http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk"/></wsse:Secur
ityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>cWm+phXCydzHP77P0UNmg3K/VtSooJ8QCx
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
H8MeABIb21nCjBIg==</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData></soap:Body></soap:Envel
ope>
--------------------------------------
九月 04, 2013 3:24:29 下午 org.apache.cxf.services.SOAPService.SoapPort.Greeter
INFO: Outbound Message
---------------------------
ID: 2
Address: http://localhost:9001/SoapContext/SoapPort
Encoding: UTF-8
Http-Method: POST
Content-Type: text/xml
Headers: {Accept=[*/*], SOAPAction=[""]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-15165035">http://apache.org/hello_world_soap_http
/Greeter/greetMeRequest</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="h
ttp://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-295384
65">urn:uuid:06f41687-bec5-4169-b107-e79efe69e243</MessageID><To xmlns="http://www.w3.org/2005/08/ad
dressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.
xsd" wsu:Id="Id-32299982">http://localhost:9001/SoapContext/SoapPort</To><ReplyTo xmlns="http://www.
w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecu
rity-utility-1.0.xsd" wsu:Id="Id-22202345"><Address>http://www.w3.org/2005/08/addressing/anonymous</
Address></ReplyTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss
-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssec
urity-utility-1.0.xsd" soap:mustUnderstand="1"><wsu:Timestamp wsu:Id="TS-9"><wsu:Created>2013-09-04T
07:24:29.327Z</wsu:Created><wsu:Expires>2013-09-04T07:29:29.327Z</wsu:Expires></wsu:Timestamp><saml2
:Assertion xmlns:saml2="urn:oasis:names:tc:SAML:2.0:assertion" xmlns:xs="http://www.w3.org/2001/XMLS
chema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" ID="_CE19E68ECA663EC06213782794690301"
IssueInstant="2013-09-04T07:24:29.030Z" Version="2.0" xsi:type="saml2:AssertionType"><saml2:Issuer>D
oubleItSTSIssuer</saml2:Issuer><ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:Signe
dInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/><ds:SignatureM
ethod Algorithm="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/><ds:Reference URI="#_CE19E68ECA663EC06
213782794690301"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped
-signature"/><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespac
es xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="xs"/></ds:Transform></ds:Transform
s><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>EeHzgoNohbrT3
diR5JDCogRS5uk=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>hz0JzicZhAEhOT4h11
Bk0WrxW3OyQ3+c/6dFbApnMtDEHj0OmK+isqXKSablineHYE6OclJBpI3ZMgtXeX/NBrmfmpsSc81pruGlk5BiQWyMRuyDG6LYim
isz2psE4Uzi5W6OZAKMJzb96IDGXVF7AxA1U9Op32omhRmxoYL7l0=</ds:SignatureValue><ds:KeyInfo><ds:X509Data><
ds:X509Certificate>MIID5jCCA0+gAwIBAgIJAPahVdM2UPibMA0GCSqGSIb3DQEBBQUAMIGpMQswCQYDVQQGEwJVUzER
MA8GA1UECBMITWFyeWxhbmQxEjAQBgNVBAcTCUJhbHRpbW9yZTEpMCcGA1UEChMgU2FtcGxlIFNU
UyAtLSBOT1QgRk9SIFBST0RVQ1RJT04xFjAUBgNVBAsTDUlUIERlcGFydG1lbnQxFDASBgNVBAMT
C3d3dy5zdHMuY29tMRowGAYJKoZIhvcNAQkBFgtzdHNAc3RzLmNvbTAeFw0xMTAyMDkxODM4MTNa
Fw0yMTAyMDYxODM4MTNaMIGpMQswCQYDVQQGEwJVUzERMA8GA1UECBMITWFyeWxhbmQxEjAQBgNV
BAcTCUJhbHRpbW9yZTEpMCcGA1UEChMgU2FtcGxlIFNUUyAtLSBOT1QgRk9SIFBST0RVQ1RJT04x
FjAUBgNVBAsTDUlUIERlcGFydG1lbnQxFDASBgNVBAMTC3d3dy5zdHMuY29tMRowGAYJKoZIhvcN
AQkBFgtzdHNAc3RzLmNvbTCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAo+f8gs4WcteLdSPW
Pm8+ciyEz7zVmA7kcCGFQQvlO0smxRViWJ1x+yniT5Uu86UrAQjxRJyANBomQrirfE7KPrnCm6iV
OsGDEntuIZAf7DFPnrv5p++jAZQuR3vm4ZHXFOFTXmI+/FD5AqLfNi17xiTxZCDYyDdD39CNFTrB
2PkCAwEAAaOCARIwggEOMB0GA1UdDgQWBBRa0A38holQIbJMFW7m5ZSw+iVDHDCB3gYDVR0jBIHW
MIHTgBRa0A38holQIbJMFW7m5ZSw+iVDHKGBr6SBrDCBqTELMAkGA1UEBhMCVVMxETAPBgNVBAgT
CE1hcnlsYW5kMRIwEAYDVQQHEwlCYWx0aW1vcmUxKTAnBgNVBAoTIFNhbXBsZSBTVFMgLS0gTk9U
IEZPUiBQUk9EVUNUSU9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW50MRQwEgYDVQQDEwt3d3cuc3Rz
LmNvbTEaMBgGCSqGSIb3DQEJARYLc3RzQHN0cy5jb22CCQD2oVXTNlD4mzAMBgNVHRMEBTADAQH/
MA0GCSqGSIb3DQEBBQUAA4GBACp9yK1I9r++pyFT0yrcaV1m1Sub6urJH+GxQLBaTnTsaPLuzq2g
IsJHpwk5XggB+IDe69iKKeb74Vt8aOe5usIWVASgi9ckqCwdfTqYu6KG9BlezqHZdExnIG2v/cD/
3NkKr7O/a7DjlbE6FZ4G1nrOfVJkjmeAa6txtYm1Dm/f</ds:X509Certificate></ds:X509Data></ds:KeyInfo></ds:Sig
nature><saml2:Subject><saml2:NameID Format="urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified" N
ameQualifier="http://cxf.apache.org/sts">alice</saml2:NameID><saml2:SubjectConfirmation Method="urn:
oasis:names:tc:SAML:2.0:cm:holder-of-key"><saml2:SubjectConfirmationData xsi:type="saml2:KeyInfoConf
irmationDataType"><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><ds:X509Data><ds:X509Cer
tificate>MIIEFjCCA3+gAwIBAgIJAJORWX2Xsa8DMA0GCSqGSIb3DQEBBQUAMIG5MQswCQYDVQQGEwJVUzER
MA8GA1UECBMITmV3IFlvcmsxFjAUBgNVBAcTDU5pYWdhcmEgRmFsbHMxLDAqBgNVBAoTI1NhbXBs
ZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW50MRcw
FQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3DQEJARYRY2xpZW50QGNsaWVudC5jb20w
HhcNMTEwMjA5MTgzMDI3WhcNMjEwMjA2MTgzMDI3WjCBuTELMAkGA1UEBhMCVVMxETAPBgNVBAgT
CE5ldyBZb3JrMRYwFAYDVQQHEw1OaWFnYXJhIEZhbGxzMSwwKgYDVQQKEyNTYW1wbGUgQ2xpZW50
IC0tIE5PVCBGT1IgUFJPRFVDVElPTjEWMBQGA1UECxMNSVQgRGVwYXJ0bWVudDEXMBUGA1UEAxMO
d3d3LmNsaWVudC5jb20xIDAeBgkqhkiG9w0BCQEWEWNsaWVudEBjbGllbnQuY29tMIGfMA0GCSqG
SIb3DQEBAQUAA4GNADCBiQKBgQDauFNVqi4B2+u/PC9ktDkn82bglEQYcL4o5JRUhQVEhTK2iElo
z1Rvo/qyfDhBPc1lzIUn4ams+DKBSSjZMCgop3XbeCXzIVP784ruC8HF5QrYsXUQfTc7lzqafXZX
H8Bk89gSScA1fFme6TpvYzM0zjBETSXADtKOs9oKB2VOIwIDAQABo4IBIjCCAR4wHQYDVR0OBBYE
FFIz+0BSZlLtXkA/udRjRgphtREuMIHuBgNVHSMEgeYwgeOAFFIz+0BSZlLtXkA/udRjRgphtREu
oYG/pIG8MIG5MQswCQYDVQQGEwJVUzERMA8GA1UECBMITmV3IFlvcmsxFjAUBgNVBAcTDU5pYWdh
cmEgRmFsbHMxLDAqBgNVBAoTI1NhbXBsZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU9OMRYw
FAYDVQQLEw1JVCBEZXBhcnRtZW50MRcwFQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3
DQEJARYRY2xpZW50QGNsaWVudC5jb22CCQCTkVl9l7GvAzAMBgNVHRMEBTADAQH/MA0GCSqGSIb3
DQEBBQUAA4GBAEjEr9QfaYsZf7ELnqB++OkWcKxpMt1Yj/VOyL99AekkVTM+rRHCU9Bu+tncMNsf
y8mIXUC1JqKQ+Cq5RlaDh/ujzt6i17G7uSGd6U1U/DPZBqTm3Dxwl1cMAGU/CoAKTWE+o+fS4Q2x
Hv7L1KiXQQc9EWJ4C34Ik45fB6g3DiTj</ds:X509Certificate></ds:X509Data></ds:KeyInfo></saml2:SubjectConfi
rmationData></saml2:SubjectConfirmation></saml2:Subject><saml2:Conditions NotBefore="2013-09-04T07:2
4:29.093Z" NotOnOrAfter="2013-09-04T07:54:29.093Z"><saml2:AudienceRestriction><saml2:Audience>http:/
/localhost:9001/SoapContext/SoapPort</saml2:Audience></saml2:AudienceRestriction></saml2:Conditions>
<saml2:AttributeStatement><saml2:Attribute Name="token-requestor" NameFormat="http://cxf.apache.org/
sts"><saml2:AttributeValue xsi:type="xs:string">authenticated</saml2:AttributeValue></saml2:Attribut
e></saml2:AttributeStatement></saml2:Assertion><xenc:EncryptedKey xmlns:xenc="http://www.w3.org/2001
/04/xmlenc#" Id="EK-FDAAB3AADBF82F327813782794693427"><xenc:EncryptionMethod Algorithm="http://www.w
3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/><ds:KeyInfo xmlns:ds="http://www.w3.org/2000/09/xmldsig#"><wss
e:SecurityTokenReference><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>1.2.840.113549.1.9.1=#
16137365727669636540736572766963652e636f6d,CN=www.service.com,OU=IT Department,O=Sample Web Service
Provider -- NOT FOR PRODUCTION,L=Buffalo,ST=New York,C=US</ds:X509IssuerName><ds:X509SerialNumber>13
439384057678826227</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></wsse:SecurityTokenRefe
rence></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>AdXYXvDA41S0sKPfP06XKWjP9AgYcNvcQrbIXxjs/5GuLa
jEsWGM2WCfQuYBpaK/g2457q8BVuI3qUXlSMB6lP8P4Sg6gSDRQi8ADQDPbIKJ5F+BHudgEFF1FueYv5pEcglhcCdgSxRDY3Xbkn
x0wUaO3uBGtoY6QiqtzOQ9N3U=</xenc:CipherValue></xenc:CipherData><xenc:ReferenceList><xenc:DataReferen
ce URI="#ED-11"/></xenc:ReferenceList></xenc:EncryptedKey><ds:Signature xmlns:ds="http://www.w3.org/
2000/09/xmldsig#" Id="SIG-10"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm="http://www.w3.org
/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" P
refixList="soap"/></ds:CanonicalizationMethod><ds:SignatureMethod Algorithm="http://www.w3.org/2000/
09/xmldsig#rsa-sha1"/><ds:Reference URI="#TS-9"><ds:Transforms><ds:Transform Algorithm="http://www.w
3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14
n#" PrefixList="wsse soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3
.org/2000/09/xmldsig#sha1"/><ds:DigestValue>jNMmIt5rJhkx8fAvb1fT1g7PUCU=</ds:DigestValue></ds:Refere
nce><ds:Reference URI="#Id-2920740"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/1
0/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixLi
st=""/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#
sha1"/><ds:DigestValue>P0xB0rOM85V8w2yFDjfz2bHfGdM=</ds:DigestValue></ds:Reference><ds:Reference URI
="#Id-32299982"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec
:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Tran
sform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:Diges
tValue>rSbepXB/9SAWI0PFLEWVwhe+Hmo=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-22202345">
<ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamesp
aces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Trans
forms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>DEPHHvvus
/tCTTdik5mxt7r3wXE=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-29538465"><ds:Transforms><
ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="h
ttp://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Transforms><ds:Digest
Method Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>I4BSYAIVQhNmmQSkkdOXwTJME
3M=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-15165035"><ds:Transforms><ds:Transform Alg
orithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org
/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm
="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>i/8tT8/OzpXWTESAlRZDRu716Ec=</ds:DigestVa
lue></ds:Reference></ds:SignedInfo><ds:SignatureValue>h4rrUGAqdYYV3KvuRoejKEq/jNwu0G8K9DMrzN8WsNp2tM
Ebuk56jwDpZ8v22HwMgAlcuTNKl5oeWd15utlOSFHxDZQ07hYsN4S2BevcKuECJU5g1Zq7JpBnRVkiybxQxKVFhET30YBW55qLnL
it/UjdOOtUhhngHfuHDlufjGU=</ds:SignatureValue><ds:KeyInfo Id="KI-FDAAB3AADBF82F327813782794693276"><
ns3:SecurityTokenReference xmlns:ns3="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecu
rity-secext-1.0.xsd" xmlns:wsse11="http://docs.oasis-open.org/wss/oasis-wss-wssecurity-secext-1.1.xs
d" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV2.0"><ns3:
KeyIdentifier ValueType="http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID">_CE
19E68ECA663EC06213782794690301</ns3:KeyIdentifier></ns3:SecurityTokenReference></ds:KeyInfo></ds:Sig
nature></wsse:Security></soap:Header><soap:Body xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oa
sis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-2920740"><xenc:EncryptedData xmlns:xenc="http:
//www.w3.org/2001/04/xmlenc#" Id="ED-11" Type="http://www.w3.org/2001/04/xmlenc#Content"><xenc:Encry
ptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns:ds="http://ww
w.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-open.org/wss/2
004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsse11="http://docs.oasis-open.org/wss/oasi
s-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oasis-wss-soap-mes
sage-security-1.1#EncryptedKey"><wsse:Reference URI="#EK-FDAAB3AADBF82F327813782794693427"/></wsse:S
ecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>YLQPCF7S2gVJSrBfw488UXeoc5xWiW
Qu8oTWw9N3BYbdykgGwu/IGQbBe0unh4xENXlIihhB60zF7iikp9fBV2ocnupOYevBPuyHj0WMzncEhearNKPkRoL0LtgapRAR/L
XtYWYtexIkB63Zv7Ie2p8cI8dLLbJohzsEdNasBtE=</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData>
</soap:Body></soap:Envelope>
--------------------------------------
九月 04, 2013 3:24:30 下午 org.apache.cxf.services.SOAPService.SoapPort.Greeter
INFO: Inbound Message
----------------------------
ID: 2
Response-Code: 200
Encoding: UTF-8
Content-Type: text/xml;charset=UTF-8
Headers: {content-type=[text/xml;charset=UTF-8], Server=[Jetty(8.1.7.v20120910)], transfer-encoding=
[chunked]}
Payload: <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><Action
xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis
-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-26845597">http://apache.org/hello_world_soap_http
/Greeter/greetMeResponse</Action><MessageID xmlns="http://www.w3.org/2005/08/addressing" xmlns:wsu="
http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-45281
42">urn:uuid:1209e86e-0b79-4d44-819b-15a89eb0b8b5</MessageID><To xmlns="http://www.w3.org/2005/08/ad
dressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.
xsd" wsu:Id="Id-27888759">http://www.w3.org/2005/08/addressing/anonymous</To><RelatesTo xmlns="http:
//www.w3.org/2005/08/addressing" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-
wssecurity-utility-1.0.xsd" wsu:Id="Id-3038206">urn:uuid:06f41687-bec5-4169-b107-e79efe69e243</Relat
esTo><wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-s
ecext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility
-1.0.xsd" soap:mustUnderstand="1"><wsse:BinarySecurityToken EncodingType="http://docs.oasis-open.org
/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary" ValueType="http://docs.oasis-o
pen.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3" wsu:Id="0A0326FD1A345C05D6137827
94704345">MIIEFjCCA3+gAwIBAgIJAJORWX2Xsa8DMA0GCSqGSIb3DQEBBQUAMIG5MQswCQYDVQQGEwJVUzERMA8GA1UECBMITm
V3IFlvcmsxFjAUBgNVBAcTDU5pYWdhcmEgRmFsbHMxLDAqBgNVBAoTI1NhbXBsZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU
9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW50MRcwFQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3DQEJARYRY2xpZW50QG
NsaWVudC5jb20wHhcNMTEwMjA5MTgzMDI3WhcNMjEwMjA2MTgzMDI3WjCBuTELMAkGA1UEBhMCVVMxETAPBgNVBAgTCE5ldyBZb3
JrMRYwFAYDVQQHEw1OaWFnYXJhIEZhbGxzMSwwKgYDVQQKEyNTYW1wbGUgQ2xpZW50IC0tIE5PVCBGT1IgUFJPRFVDVElPTjEWMB
QGA1UECxMNSVQgRGVwYXJ0bWVudDEXMBUGA1UEAxMOd3d3LmNsaWVudC5jb20xIDAeBgkqhkiG9w0BCQEWEWNsaWVudEBjbGllbn
QuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDauFNVqi4B2+u/PC9ktDkn82bglEQYcL4o5JRUhQVEhTK2iEloz1Rvo/
qyfDhBPc1lzIUn4ams+DKBSSjZMCgop3XbeCXzIVP784ruC8HF5QrYsXUQfTc7lzqafXZXH8Bk89gSScA1fFme6TpvYzM0zjBETS
XADtKOs9oKB2VOIwIDAQABo4IBIjCCAR4wHQYDVR0OBBYEFFIz+0BSZlLtXkA/udRjRgphtREuMIHuBgNVHSMEgeYwgeOAFFIz+0
BSZlLtXkA/udRjRgphtREuoYG/pIG8MIG5MQswCQYDVQQGEwJVUzERMA8GA1UECBMITmV3IFlvcmsxFjAUBgNVBAcTDU5pYWdhcm
EgRmFsbHMxLDAqBgNVBAoTI1NhbXBsZSBDbGllbnQgLS0gTk9UIEZPUiBQUk9EVUNUSU9OMRYwFAYDVQQLEw1JVCBEZXBhcnRtZW
50MRcwFQYDVQQDEw53d3cuY2xpZW50LmNvbTEgMB4GCSqGSIb3DQEJARYRY2xpZW50QGNsaWVudC5jb22CCQCTkVl9l7GvAzAMBg
NVHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4GBAEjEr9QfaYsZf7ELnqB++OkWcKxpMt1Yj/VOyL99AekkVTM+rRHCU9Bu+tncMN
sfy8mIXUC1JqKQ+Cq5RlaDh/ujzt6i17G7uSGd6U1U/DPZBqTm3Dxwl1cMAGU/CoAKTWE+o+fS4Q2xHv7L1KiXQQc9EWJ4C34Ik4
5fB6g3DiTj</wsse:BinarySecurityToken><wsu:Timestamp wsu:Id="TS-1"><wsu:Created>2013-09-04T07:24:30.4
19Z</wsu:Created><wsu:Expires>2013-09-04T07:29:30.419Z</wsu:Expires></wsu:Timestamp><xenc:EncryptedK
ey xmlns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="EK-0A0326FD1A345C05D613782794704344"><xenc:Enc
ryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/><ds:KeyInfo xmlns:ds="htt
p://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference><wsse:Reference URI="#0A0326FD1A345C05
D613782794704345" ValueType="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-prof
ile-1.0#X509v3"/></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>zQhl/
Nlgcv6EAqHAiQHXSYWYA/1PK/uq4m/VMik2E8/IOVIzewrj3LVlfS+4VU94JWChRvoV6ZRgBaxRRaXrcIAaxrKoxMF3GDmJb1FYS
o8kcJZBgAEGYGaArGFFTTkavCLHnSxuI8E9xs/Rb+qs0bcfcNpub5/16+4IesDzMDM=</xenc:CipherValue></xenc:CipherD
ata><xenc:ReferenceList><xenc:DataReference URI="#ED-3"/></xenc:ReferenceList></xenc:EncryptedKey><d
s:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#" Id="SIG-2"><ds:SignedInfo><ds:Canonicaliza
tionMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="htt
p://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:CanonicalizationMethod><ds:SignatureMe
thod Algorithm="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/><ds:Reference URI="#TS-1"><ds:Transform
s><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec
="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="wsse soap"/></ds:Transform></ds:Transforms><d
s:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>MvT8jhYw+XJdprG3r
x1gXZuO3lk=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-28117745"><ds:Transforms><ds:Trans
form Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://ww
w.w3.org/2001/10/xml-exc-c14n#" PrefixList=""/></ds:Transform></ds:Transforms><ds:DigestMethod Algor
ithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>htzvuvx3W7mcji00ucJrh47/BuU=</ds:Dige
stValue></ds:Reference><ds:Reference URI="#Id-27888759"><ds:Transforms><ds:Transform Algorithm="http
://www.w3.org/2001/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml
-exc-c14n#" PrefixList="soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www
.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>7Dj8cB+hWMkAVDBjaEi889hqZuA=</ds:DigestValue></ds:Ref
erence><ds:Reference URI="#Id-4528142"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/200
1/10/xml-exc-c14n#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" Prefi
xList="soap"/></ds:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/x
mldsig#sha1"/><ds:DigestValue>A2QtcGfn73JPvjnnuccCDJenQuU=</ds:DigestValue></ds:Reference><ds:Refere
nce URI="#Id-3038206"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n
#"><ec:InclusiveNamespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></d
s:Transform></ds:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds
:DigestValue>z2ExQG5GM0PQJzBCA+ukDvF4PuE=</ds:DigestValue></ds:Reference><ds:Reference URI="#Id-2684
5597"><ds:Transforms><ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"><ec:Inclusive
Namespaces xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#" PrefixList="soap"/></ds:Transform></ds
:Transforms><ds:DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha1"/><ds:DigestValue>ZT5
WwfBEQaLUuBhZg+IV8EOyaVA=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue>ihGRpP+P
f/A6d+3kMtBinMlRyJ5CwSiiiAo2I7C/QB1YU8YHK9gX4KjhukpCY1Q84kReCxRRkr6GHlu5H5779p6RzDpWr5D8M4efMH8X4b1T
BLXGAsQd5g6Pw8XPWOL4pgFBt2vXiXBAR8T2xCyUYoJ9QZHpiwq1jwF/z279n3E=</ds:SignatureValue><ds:KeyInfo Id="
KI-0A0326FD1A345C05D613782794704192"><wsse:SecurityTokenReference wsu:Id="STR-0A0326FD1A345C05D61378
2794704193"><ds:X509Data><ds:X509IssuerSerial><ds:X509IssuerName>1.2.840.113549.1.9.1=#1613736572766
9636540736572766963652e636f6d,CN=www.service.com,OU=IT Department,O=Sample Web Service Provider -- N
OT FOR PRODUCTION,L=Buffalo,ST=New York,C=US</ds:X509IssuerName><ds:X509SerialNumber>134393840576788
26227</ds:X509SerialNumber></ds:X509IssuerSerial></ds:X509Data></wsse:SecurityTokenReference></ds:Ke
yInfo></ds:Signature></wsse:Security></soap:Header><soap:Body xmlns:wsu="http://docs.oasis-open.org/
wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" wsu:Id="Id-28117745"><xenc:EncryptedData xm
lns:xenc="http://www.w3.org/2001/04/xmlenc#" Id="ED-3" Type="http://www.w3.org/2001/04/xmlenc#Conten
t"><xenc:EncryptionMethod Algorithm="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/><ds:KeyInfo xmlns
:ds="http://www.w3.org/2000/09/xmldsig#"><wsse:SecurityTokenReference xmlns:wsse="http://docs.oasis-
open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsse11="http://docs.oasis-ope
n.org/wss/oasis-wss-wssecurity-secext-1.1.xsd" wsse11:TokenType="http://docs.oasis-open.org/wss/oasi
s-wss-soap-message-security-1.1#EncryptedKey"><wsse:Reference URI="#EK-0A0326FD1A345C05D613782794704
344"/></wsse:SecurityTokenReference></ds:KeyInfo><xenc:CipherData><xenc:CipherValue>F5zZ6Njp3F5v+4Yl
WSe+yx/zHkK0WUMtKK5tgY9aPlVlVVXUWdJ0tCytUU86Iz4tQS6bAcgwawBuvjAt7ftYUH0WsPwz2xopmJ5SAjQVslphfwMMirKL
0Z4+rdhfbTtyatRDvJdVif60NsdIS0mwLMDbtenQg66m+RnqBqQavRYbsc413dc6RzfkNmyhVzvd0TUVtDVcPFTgubNQiW2C1Q==
</xenc:CipherValue></xenc:CipherData></xenc:EncryptedData></soap:Body></soap:Envelope>
--------------------------------------
Server responded with: Hello dell

F:\java\lib\cxf\apache-cxf-2.7.6\samples\sts>
------------------------------------------------------------------------


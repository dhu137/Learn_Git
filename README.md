# Learn_Git
学习使用Git
该文档是137学习git文档
第一步： 先在dhu137创建一个repository，接着进入库文件目录中，找到SSH的URL地址，复制并粘贴下来
第二步： 在idea的本地文件目录下使用git bash here 
第三步： git clone https://github.com/dhu137/Learn_Git.git（此URL为刚才复制的地址）
第四步：可以发现在idea本地目录下多了一个Learn_Git目录，接下来把之前写好的所有项目都可以放入到Learn_Git目录下
第五步：cd Learn_Git
       git add . 
       git commit  -m  "提交信息"  （注：“提交信息”里面换成你需要，如“first commit”）
       git push -u origin master   （注：此操作目的是把本地仓库push到github上面，此步骤需要你输入帐号和密码）
第六步：成功添加到Github的库中

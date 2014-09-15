@echo 
echo main

@rem 生成javabean 包含 包含基础解析等  和 contentProvider
@set start_cmd=start cmd /k java -jar main.jar
%start_cmd% com.mobile17173.game.bean com.mobile17173.game.db TestBean ./in/test.json

pause
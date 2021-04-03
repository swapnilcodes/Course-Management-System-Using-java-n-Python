import smtplib
import json
import random

data = open(
    "C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\TXT's\\createNewTry.txt", 'r')
data = data.read()
data = json.loads(data)
email = data["email"]

otp = random.randint(1000, 9999)
writer = open(
    "C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\TXT's\\currentOtp.txt", 'w')
writer.write(str(otp))
writer.close()
message = f'Your otp for course management system is {otp}'

smtp = smtplib.SMTP('smtp.gmail.com', 587)
smtp.starttls()
smtp.login('deshmaneswapnil737@gmail.com', 'swam@4782s')
smtp.sendmail('deshmaneswapnil737@gmail.com', email, message)
smtp.quit()

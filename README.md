## SMTP ( Simple Mail Transfer Protocol )
SMTP is the basic standard that mail servers use to send email to one another across the Internet.

To use Gmail's SMTP server, the following setting are needed for outgoing emails

1. Outgoing Mail (SMTP) Server : smtp.gmail.com
2. Use Authentication : Yes
3. use Secure Connection : Yes (TLS or SSL depending on your mail client/website SMTP plugin)
4. Username : your Gmail account
5. password : your Gmail password
6. Port : 465(SSL required) or 587(TLS required)

When SMTP server is Gmail, there might be additional setting to need.
ex) secondary password, App password
At the time, app password applies to spring.mail.password
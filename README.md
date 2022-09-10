# spring-orm

User
----
1 - shahid  || 2 - khalid

Role
----
1 - Admin  || 2 - Manager

user_role
---------
shahid is manager and admin
1 - shahid - manager || 2 - shahid - admin
khalid is manager
3 - khalid - manager

Permission
-----------
google.com  || yahoo.com

role_permission
---------------
manager can acess only google.com
admin can access both 
1 admin   -- google.com 
2 admin   -- yahoo.com
3 manager -- yahoo.com

privilege
---------
user(shahid) with role admin can access google.
user(shahid) with role manager can access yahoo.
user(khalid) with role manager can access yahoo.

--------------------------------------------
permission_privilege
1 role permission (1) can do read    
2 role permission (1) can do write
3 role permission (2) can do read
4 role permission (3) can do read

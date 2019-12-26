Spool C:\Informatica\build\cc\drop_tables.sql 
SELECT 'DROP TABLE ' || table_name || ' CASCADE CONSTRAINTS;'  FROM user_tables; 
Spool off 

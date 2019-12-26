Spool C:\Informatica\build\cc\drop_views.sql 
SELECT 'DROP VIEW ' || tname || ' CASCADE CONSTRAINTS;'  FROM tab; 
Spool off 

SQL> SELECT 'DROP TABLE ' || table_name || ' CASCADE CONSTRAINTS;'  FROM user_tables;

'DROPTABLE'||TABLE_NAME||'CASCADECONSTRAINTS;'                                  
--------------------------------------------------------------                  
DROP TABLE EMPLOYEE CASCADE CONSTRAINTS;                                        
DROP TABLE TEMP1 CASCADE CONSTRAINTS;                                           
DROP TABLE ALLDTYPES_ORA CASCADE CONSTRAINTS;                                   
DROP TABLE ALLDTYPES_ORA_TGT CASCADE CONSTRAINTS;                               
DROP TABLE RECORD_BLOB CASCADE CONSTRAINTS;                                     
DROP TABLE RECORD_LONG_RAW CASCADE CONSTRAINTS;                                 
DROP TABLE EMPLOYEE123 CASCADE CONSTRAINTS;                                     
DROP TABLE PERSONS_READ CASCADE CONSTRAINTS;                                    
DROP TABLE PERSONS_WRITE_TGT_WOUTPKEY CASCADE CONSTRAINTS;                      
DROP TABLE RECORD_LONG_RAW_TGT CASCADE CONSTRAINTS;                             
DROP TABLE TABLE_BLOB CASCADE CONSTRAINTS;                                      

'DROPTABLE'||TABLE_NAME||'CASCADECONSTRAINTS;'                                  
--------------------------------------------------------------                  
DROP TABLE PERSONS_WRITE_TGT CASCADE CONSTRAINTS;                               

12 rows selected.

SQL> Spool off

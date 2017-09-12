# Driver-License-Issuing-System
In  this  project  you  have  a  task  to  design  and  implement  a  Driver  License   Issuing  System.

In  this  project  you  have  a  task  to  design  and  implement  a  Driver  License   Issuing  System.  Your  application  should  provide  the  following  services: 
A.   Create  new  driver  license 
B.   Modify  driver  license  information  
C.   Search  for  a  driver 
D.   Delete  a  driver  license  
E.   Display  the  information  of  any  driver  license  
A.  Create  new  driver  license:
In  this  task,  a  user  creates  a  new   license  by  entering  the  following  information: 
1-­‐  Driver’s  Name  [first,  middle,  and  last]
2-­‐  Driver’s  personal  ID  number
3-­‐  Driver’s  address  [Country,  City,  Street  name,  and  mail  box  number]
4-­‐  Driver’s  driving  experience  [novice  or  expert]
5-­‐  Driver’s  vehicle  type  [car,  truck,  or  motor  bike] 
a-­‐  Each  driver  can  have  ,  at  most,  two  cars  registered  in  his/her   license        
6-­‐  Driver’s  vehicle  brand  [Merc,  Bmw,  Honda,  Toyota,  Vw,  Nissan,  or   Volvo] 
a-­‐  Each  vehicle  has  its  own  unique  registration  plate  number 
b-­‐  Each  vehicle  has  a  manufacturing  year  (e.g.  2005)
7-­‐  The  year  of  issuing  the  license  and  its  validity  period;  the  validity   should  be  automatically  generated  by  the  program  on  the  following   bases: 
1-­‐  One  year  for  novice  drivers 
2-­‐  Four  years  for  expert  drivers  
Notes: 
1-­‐  License  Id  number  is  automatically  generated  by  the  program   on  a  sequential   base  starting  at:  100000 
2-­‐  Car  registration  plate  number  is  automatically  generated  by  the   program  on  a   sequential  base  starting  at:  60000000  
B.  Modify  driver  license  information:  In  this  task,  a  user,   choosing  the  Modify  option,  can  update  any  information  he/she  wishes   to  modify:  
1-­‐  When  the  user  chooses  the  modify  option,  your  program  should   show  a  screen  with  items  of  part  A  above  listed.  These  items  should  be   numbered  [1  to  7].  
2-­‐The  user  chooses  the  item  that  he/she  wishes  to  modify  by  choosing   its  number  from  the  list.  
3-­‐  Next,  a  dialog  is  displayed  to  enter  new  data  of  the  chosen  item    
 4-­‐  After  each  update  operation,  the  new  license  is  displayed  to  show   modifications  
 5-­‐  Finally,  The  user  is  asked  if  he/she  wishes  to  modify  another  item 
 a-­‐  Yes  answer,  repeats  the  operation
 b-­‐  No  answer,  exits  the  modification  screen  and  returns  to  main   screen
 C.  Search  for  a  driver: 
 In  this  task,  a  user  can  search  for  a  driver   by:  
 1-­‐  Driver’s  license  number
 2-­‐  Driver’s  personal  ID  number
 3-­‐  Car  registration  plate  number
 4-­‐  Driver’s  last  name   Note:
 1-­‐  In  case  you  have  more  than  one  result  (for  example,  using  option  2   of  this  task);  the  results  of  the  search  option  should  be  displayed  in  a   numbered  list  on  the  screen
 2-­‐  Each  result  screen  should  only  display  15  records
 3-­‐  Each  record  only  contains  Driver’s  name  and  License  ID  number
 4-­‐  The  user  finds  the  targeted  match  and  remembers  its  list  number
 5-­‐  The  user  enters  the  number  he/she  remembers  in  an  input  dialog   pressing  Yes  .  And  the  Driver’s  license  is  displayed  on  the  screen.     
D.  Delete  a  driver  license:
In  this  task,  a  user  can  delete  any   driver’s  license  by  entering  its  ID  number.
1-­‐  The  License  is  displayed  to  user  and  If  the  user  chooses  to  delete  a   license,  a  confirmation  message  must  be  displayed  warning  the  user   that  the  information  of  this  license  will  be  lost  if  he/she  confirmed   deletion
2-­‐  Pressing  Yes  for  the  confirmation  message,  the  license  will  be   deleted.  Pressing  No,  will  cancel  the  deletion  process.
3-­‐  Any  search  operation  for  the  deleted  license  should  display  no   results
E.  Display  the  information  of  any  driver  license:  
In  this   last  task,  a  user  will  have  two  main  choices:
1-­‐  Show  All:  will  display  all  Drivers’  license  records.   Each  record  contains:  name,  License  ID  number,  and  Personal  ID   number
2-­‐  Show  Specific:  will  inform  a  user  to  enter  License  ID  number  or   Personal  ID  number.   Valid  ID  numbers  (i.e.  ID  numbers  stored  in  the  system)  will  result  in   displaying  the  correct  Driver’s  license  .  

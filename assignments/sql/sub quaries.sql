
1
select ename ,job
from emp 
where job='manager';
2
select e.ename , 
case
when d.dname = 'sales' then 'sales'
else 'not sales'
end as 'sales or not' ,
case 
when e.sal > 1000 then e.sal
else '1000'
end as salary

from emp e , dept d 
3
select e.ename ,
case 
when sal<1000 then 'low'
when sal between 1000 and 2500 then 'medium'
else 'high'
end as 'salary range'
from emp e;
4
select e.ename 
from emp e 
where e.job = 'salesman' and e.sal < (select sal from emp where ename ='miller');
select *from emp;
select *from DEPT;
5
select *from emp join dept 
on emp.deptno = dept.deptno
where dept.loc='chicago';
6
select e.ename
from emp e
where sal > (select min(sal) from emp group by job having job='manager')
7
select e.ename , e.empno
from emp e 
where e.DEPTNO =(select DEPTNO from dept where DNAME = 'accounting');

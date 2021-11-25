1
select *from emp;
select DEPTNO ,sum(sal)'total sal'
from emp
group by DEPTNO;

2
select DEPTNO ,min(sal) 'minsal'
from emp 
where DEPTNO =10
group by deptno;
3
select job , avg(sal) 'manager avg sal'
from emp
GROUP BY JOB
HAVING job='MANAGER';

4
select job , SUM(sal) 'saleman  total sal'
from emp
GROUP BY JOB
HAVING job='salesman';

5
select deptno , avg(sal) 'a1'
from emp
group by deptno
having avg(sal)<(select avg(sal) from emp);

6

select job , count(ENAME) 'no of persons'
from emp
group by job;

7
select job , max(sal) 'analyst mac sal'
from emp
where job = 'analyst'
group by job ;
 8
 select max(comm) 'max comm'
 from emp;
 9
 select  count(distinct deptno) 'no of dept'
 from emp;


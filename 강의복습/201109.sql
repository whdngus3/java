-- scott�� ����� �� �ִ� ���̺� �� ������
select * from tab;
select * from emp;
select * from dept;
-- �ڱ� �μ� ��պ��� �޿��� ���� �޴� ����� �̸�, �޿�
-- ������� ����(query)
select ename, sal from emp e where
sal > (select round(avg(sal)) from emp
    where e.deptno=deptno);
-- �ڱ� �μ� ��պ��� �޿��� ���� �޴� ����� �̸�, �޿�, �μ� ��ձ޿�
-- in_line view : from���� sub query�� ����ؼ� tableó�� ó���ϴ� ��
select e.ename,e.sal,a.avg, e.deptno from emp e, (select deptno,round(avg(sal)) avg
 from emp group by deptno) a where e.deptno=a.deptno and sal > avg;
-- �޿��� ���� �޴� ���� 5�� ������� topN
-- mysql : select ename,sal from emp order by sal desc limit 5;
select rownum, ename,sal from emp;
-- rownum : ���̺�� ���� �����͸� �����ϴ� ����
select a.*, rownum from (select rownum rn, ename, sal from emp order by sal desc)a
where rownum <= 5;
-- 6�� ~ 10����� ���
-- mysql : select ename, sal from emp order by sal desc limit 5, 5;
select a.*, rownum rn from (select  ename, sal from emp order by sal desc)a;
select * from (select a.*, rownum rn from (select  ename, sal from emp order by sal desc)a)
where rn between 6 and 10;
select * from emp;
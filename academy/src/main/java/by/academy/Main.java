package by.academy;

public class Main {
	public static void main (String[] args) {
int s=370000;
int sec;
int m;
int min;
int h;
int d;
int din;
int n;
int nin;



sec=s%60;
m=(s-sec)/60;
min=m%60;
h=(m-min)/60;
din=h%24;
d=(h-din)/24;
nin=d%7;
n=(d-nin)/7;





System.out.println(h+ " �����" + min + " �����"+ sec +" ������");

System.out.println(d+ " �����" +n + " ������");
}
}

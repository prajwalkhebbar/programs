#include<iostream>
#include<stdio.h>
using namespace std;
int n;
int issafe(int a[][10],int r,int c)
{
	int i,j;
	for(i=0;i<r;i++)
	{
		if(a[i][c]==1)
		{
			return 0;
		}
	}

		for(i=r,j=c;i>=0&&j>=0;i--,j--)
		{
			if(a[i][j]==1)
			return 0;
		}

		for(i=r,j=c;i>=0&&j<n;i--,j++)
		{
			if(a[i][j]==1)
			return 0;
		}
return 1;
}
int nqueens(int a[][10],int r)
{
	
	if(r>=n)
	return 1;

	int i;

	for(i=0;i<n;i++)
	{
		if(issafe(a,r,i))
		{	
			a[r][i]=1;
			

			if(nqueens(a,r+1))
			{
				cout<<" c: "<<i<<" r:"<<r<<endl;
				return 1;
			}

			a[r][i]=0;
		}
	}
	return 0;
}	
int nq()
{
	int a[10][10]={0},i,j,x=0;
	cout<<" enter the no of queens\n";
	cin>>n;
	if(nqueens(a,0)==0)
	{
		cout<<" sol not possible no matter how much you try\n";
	}
	else
	{
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
			{
				cout<<" "<<a[i][j];
			}
	cout<<endl;
	}
	}
}
				
int main ()
{
	nq();
	return 0;
		
}

#include<iostream>
using namespace std;
int n;
void swap(int &a,int &b)
{
	int t;
	t=a;
	a=b;
	b=t;
} 
void print(int a[])
{
	int i;
	for(i=0;i<n;i++)
	{
		cout<<" "<<a[i];
	}
	cout<<endl;
}
int partition(int a[],int l,int r)
{
	int i=l+1,j=r,p=l;
	cout<<" pivot: "<<a[p]<<endl;
	while(i<j)
	{

		while(a[i]<a[p])
		i++;
		while(a[j]>a[p])
		j--;
		if(j>i)
		{
			swap(a[i],a[j]);
			print(a);
			j--;i++;
		}
	}
	if(i>j)
	{
		swap(a[j],a[p]);
		print(a);
	}
	if(i=j)
	{
		if(a[i]<a[p])
		{
			swap(a[i],a[p]);
			print(a);
		}
	}

	return j;
}
void qsort(int a[],int l,int h)
{
	if(l<h)
	{
		int s=0;
		s=partition(a,l,h);
		qsort(a,l,s-1);
		qsort(a,s+1,h);
	}
}
int main()
{

	int a[10],i;
	cout<<" enter the size of the array\n";
	cin>>n;
	cout<<" enter the array elements\n";
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	qsort(a,0,n-1);
	cout<<" the sorted array is :\n";
	print(a);
}

#include<iostream>
using namespace std;
void merge(int a[],int low,int m,int h)
{
	int l[10],r[10],i,j,k=low,l1=m-low+1,r1=h-m;
	for(i=0;i<l1;i++)
	{
		l[i]=a[low+i];
	}
	for(j=0;j<r1;j++)
	{
		r[j]=a[m+1+j];
	}
	i=0;j=0;k=low;
	while(i<l1&&j<r1)
	{
		if(l[i]<r[j])
		{
			a[k++]=l[i++];
		}
		else
			a[k++]=r[j++];
	}
	while (i < l1)
    {
        a[k] = l[i];
        i++;
        k++;
    }
 
    /* Copy the remaining elements of R[], if there
       are any */
    while (j < r1)
    {
        a[k] = r[j];
        j++;
        k++;
    }
}
void mergesort(int a[],int l,int h)
{
	if(l<h)
	{
		int m=(l+h)/2;

		mergesort(a,l,m);
		mergesort(a,m+1,h);
		merge(a,l,m,h);
	}
}
int main()
{

	int a[10],i,n;
	cout<<"enter the size of the array\n";
	cin>>n;
	cout<<"enter the array elements\n";
	for(i=0;i<n;i++)
	{

		cin>>a[i];
	}
	mergesort(a,0,n-1);
	

	cout<<" the sorted is: \n";
	for(i=0;i<n;i++)
	{

		cout<<" "<<a[i];
	}
}

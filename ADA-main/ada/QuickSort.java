package ada;

public class QuickSort {
	
	public int partition(int a[],int l,int r){
		int x=a[r];
		int i = l-1;
		int j=0;
		int temp=0;
		for(j=l;j<r;j++) {
			if(a[j]<x) {
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		return i+1;
	}
	
	public void sort(int a[],int l,int r) {
		int p=0;
		if(l<r) {
			p = partition(a,l,r);
			
			sort(a,l,p-1);
			sort(a,p+1,r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort sort=new QuickSort();
		int a[] = {1,3,4,2,5,8,6,9,7,0};
		sort.sort(a, 0, a.length-1);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}

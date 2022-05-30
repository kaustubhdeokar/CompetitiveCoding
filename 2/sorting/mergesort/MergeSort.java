public class MergeSort {

    public int[] mergeSort(int[] arr) {

        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    public int[] merge(int[] left, int[] right) {

        int[] newArr = new int[left.length + right.length];
        int k=0,i=0,j=0;

        while(i<left.length && j< right.length){
            if(left[i]<right[j])
                newArr[k++] = left[i++];
            else
                newArr[k++] = right[j++];
        }
        while(i<left.length)
            newArr[k++] = left[i++];
        while(j<right.length)
            newArr[k++] = right[j++];

        return newArr;
    }

}


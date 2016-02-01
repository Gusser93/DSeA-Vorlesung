void quicksort(int[] a, int links, int rechts) {
    if (links >= rechts) return;
    int mitte = partition(a, links, rechts);
    quicksort(a, links, mitte-1);
    quicksort(a, mitte+1, rechts);
}

int partition(int[] a, int links, int rechts) {
    int r = random(links, rechts);
    swap(a, r, rechts);
    int pivot = a[rechts];
    int i = links;
    int j = rechts-1;
    while (i <= j) {
        if (a[i] > pivot) {
            swap(a, i, j);
            j--;
        } else {
            i++;
        }
    }
    swap(a, i, rechts);
    return i;
}
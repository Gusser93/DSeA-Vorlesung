int[] a; //Eingabefeld
int[] b; //Hilfsfeld

void mergesort(int links, int rechts) {
    if (links >= rechts) return;
    int mitte = (links+rechts)/2;
    mergesort(links, mitte);
    mergesort(mitte+1, rechts);
    merge(links, mitte, rechts);
}

void merge(int links, int mitte, int rechts) {
    int i = links;
    int j = mitte+1;
    int k = links;
    while (i <= mitte && j <= rechts) {
        if (a[i] < a[j])
            b[k++] = a[i++];
        else
            b[k++] = a[j++];
    }
    while (i <= mitte)
        b[k++] = a[i++];
    while (j <= rechts)
        b[k++] = a[j++];
    for (k=links; k <= rechts; k++)
        a[k] = b[k];
}
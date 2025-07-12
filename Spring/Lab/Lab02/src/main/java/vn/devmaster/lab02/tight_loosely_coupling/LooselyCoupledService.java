package vn.devmaster.lab02.tight_loosely_coupling;

public class LooselyCoupledService {
    private SortAlgorithm sortAlgorithm;

    public LooselyCoupledService() {}

    public LooselyCoupledService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int[] arr) {
        sortAlgorithm.sort(arr);
    }

    public static void main(String[] args) {
        LooselyCoupledService sorter = new LooselyCoupledService(new LooselyBubbleSortAlgorithm());
        sorter.complexBusiness(new int[]{11, 21, 13, 42, 15});
    }
}

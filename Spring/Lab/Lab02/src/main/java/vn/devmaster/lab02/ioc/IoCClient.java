package vn.devmaster.lab02.ioc;

public class IoCClient {
    private IoCService iocService;

    public IoCClient(IoCService iocService) {
        this.iocService = iocService;
    }

    public void doSomething() {
        iocService.serve();
    }
}

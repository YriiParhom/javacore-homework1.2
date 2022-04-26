public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error){
        this.callback = callback;
        this.error = error;
    }

    public void start(){
        for (int i = 1; i <= 100; i++){
            callback.onDone("Task " + i + " is done");
           if (i == 33) error.onError("Task " + i + " error");
        }
    }
}

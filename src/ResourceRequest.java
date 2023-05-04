public class ResourceRequest extends SafetyAlgorithm {
    private int[][] need;
    private int[][] allocation;
    private int[][] max;
    private int[] available;
    private int[] request;
    private int pid;
    private Boolean granted;
    // TO DO: make it a step-by-step return of the algorithm simulation
    // PLAN: extend SafetyAlgorithm with additional instructions
    public ResourceRequest(int pid, int[] request,int[][] needs,int[][] allocations,int[][] maxs, int[] availables){
        need = new int[allocations.length][allocations[0].length];
        for(int i = 0; i < allocations.length; i++){
            for(int j = 0; j <allocations[0].length; j++){
                need[i][j] = maxs[i][j] - allocations[i][j];
            }
        }
        allocation = allocations.clone();
        max = maxs.clone();
        available = availables.clone();
        this.pid = pid;
        this.request = request.clone();
        int process = pid;
        Boolean canRequest = true;
        // check if request is possible
        for(int i = 1; i < available.length; i++){
            if(available[i] < request[i]){
                canRequest = false;
                break;
            }
        } 
        if(!canRequest){
            granted = false;
        }else{
            // assume it is granted
            for(int i = 1; i < available.length; i++){
                available[i] -= request[i];
                allocation[process][i] += request[i];
                need[process][i] -= request[i];
            } 
        }
    }
    // wrapper function for simulate in ResourceRequest
    public void execute(){
        simulate(available, allocation, need);
    }

    public Boolean getGranted() {
        return granted;
    }

    public int[][] getNeed() {
        return need;
    };
}
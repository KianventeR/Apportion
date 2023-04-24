import java.util.Scanner;

public class ResourceRequest extends SafetyAlgorithm {
    private int[][] need;
    private int[][] allocation;
    private int[][] max;
    private int[] available;
    private int[] request;
    private int pid;
    private Boolean granted;
    // TODO: make it a step-by-step return of the algorithm simulation
    // PLAN: extend SafetyAlgorithm with additional instructions
    public ResourceRequest(int pid, int[] request,int[][] needs,int[][] allocations,int[][] maxs, int[] availables){
        need = needs.clone();
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Processes: ");
        int processes = sc.nextInt();
        System.out.println("Number of Types of Resources:");
        int resources = sc.nextInt();
        // mock inputs
        int[] available = new int[resources];
        int[][] max = new int[processes][resources];
        int[][] allocation = new int[processes][resources];
        int[][] need = new int[processes][resources];
        int processID;
        int[] request = new int[resources];
        System.out.println("Input max resources per process:");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                max[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input allocation of resources per process:");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                allocation[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input available resources:");
        for(int i = 0; i < resources; i++){
                available[i] = sc.nextInt();
        }
        System.out.println("Input process number first and the resource to get:");
        processID = sc.nextInt();
        for(int i = 0; i < resources; i++){
                request[i] = sc.nextInt();
        }
        // initialize need matrix
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
        // print inputs for testing
        System.out.println("Max matrix");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                System.out.print(max[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Allocation Matrix");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                System.out.print(allocation[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Need Matrix");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                System.out.print(need[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Available array:");
        for(int j = 0; j < resources; j++){
            System.out.print(available[j]+" ");
        }
        System.out.println();
        System.out.println("Request array:");
        System.out.print(processID+" ");
        for(int j = 0; j < resources; j++){
            System.out.print(request[j]+" ");
        }
        System.out.println();
        // initialize class
        ResourceRequest rr = new ResourceRequest(processID, request, need, allocation, max, available);
        // simulate step by step
        while(rr.getStep() < 5){
            // show step
            int step = rr.getStep();
            System.out.println("Step: "+step);
            // add if-else for every sttep
            if(step == 1){
                 // simulate first
                 rr.simulate(available, allocation, need);
                
                System.out.print("Work: ");
                int[] work = rr.getWork();
                for(int i = 0; i < rr.getResources(); i++){
                    System.out.print(work[i]);
                }
                System.out.println("\nProcesses: "+rr.getProcesses());
                System.out.println("Resources: "+rr.getResources());
                Boolean[] finish = rr.getFinish();
                System.out.print("Finish: ");
                for(int i = 0; i < rr.getProcesses(); i++){
                    System.out.print(finish[i]);
                }
                System.out.println("\nGoing to step: "+rr.getStep());
            }else if(step == 2){
                int process = rr.getProcess();
                int resource = rr.getResource();
                int worked = rr.getWorked();
                int processesCopy = rr.getProcesses();
                System.out.println("worked: "+worked);
                System.out.println("Prcesses: "+processesCopy);
                System.out.println("Process: "+process);
                System.out.println("Resource: "+resource);
                
                // simulate first
                rr.simulate(available, allocation, need);

                int [][] needCopy = rr.getNeed();
                int [] work = rr.getWork();
                System.out.println("Need[process][resource]: "+needCopy[process][resource]);
                System.out.println("Work[resource]: "+work[resource]);
                // show result
                Boolean hasWork = rr.getHasWork();
                System.out.println("hasWork: "+hasWork);

                System.out.println("Going to step: "+rr.getStep());

            }else if(step == 3){
                Boolean[] finish = rr.getFinish();
                // int[][] allocationCopy = rr.getAllocation();
                 Boolean hasWork = rr.getHasWork();
                // int[] work = rr.getWork();
                 int process = rr.getProcess();
                 int resource = rr.getResource();
                 System.out.println("Process: "+process);
                 System.out.println("Resource: "+resource);
                 System.out.println("finish[process]"+finish[process]);
                 System.out.println("hasWork: "+hasWork);
                
                // simulate first
                rr.simulate(available, allocation, need);

                int worked = rr.getWorked();
                System.out.println("worked: "+worked);
                System.out.println("Going to step: "+rr.getStep());

            }else if(step == 4){
                 // simulate first
                 rr.simulate(available, allocation, need);

                Boolean[] finish = rr.getFinish();
                Boolean safe = rr.isSafe();
                System.out.print("Finish: ");
                for(int i = 0; i < rr.getProcesses(); i++){
                    System.out.print(finish[i]);
                }
                System.out.println("\nSafe: "+safe);
                System.out.println("Going to step: "+rr.getStep());
            }else{}
        }
        System.out.println("Simulation done!");
        
        //SafetyAlgorithm sa = new SafetyAlgorithm(available, allocation, need);
        System.out.println(rr.isSafe());
        sc.close();
    }
}
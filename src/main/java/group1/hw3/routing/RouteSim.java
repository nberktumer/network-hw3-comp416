package group1.hw3.routing;

import group1.hw3.util.logging.Logger;
import group1.hw3.util.logging.LoggerFactory;

import java.nio.file.Path;
import java.util.Hashtable;

public class RouteSim {
    private Logger logger = LoggerFactory.createLogger(getClass());
    private Hashtable<String, INode<IMessage>> clients;
    private boolean atLeastOneClientIsUpdated = true;
    private int round = 0;

    /**
     * Initializes the route simulator using the given input file
     * @param inputFilePath Input file path, expected to exist, may throw otherwise
     */
    public RouteSim(Path inputFilePath) {
        this.loadInitialDistances(inputFilePath);
        this.printInitialData();
    }

    public void run() {
        atLeastOneClientIsUpdated = true;
        round = 0;
        while (atLeastOneClientIsUpdated) {
            round += 1;
            logger.d("Running round " + round);
            doOneIteration();
        }
        logger.i("Distance Vector Routing Algorithm converged in " + round + " rounds.");
    }

    private void doOneIteration() {
        atLeastOneClientIsUpdated = false;
        for (String clientId : clients.keySet()) {
            INode<IMessage> client = clients.get(clientId);
            if (client.sendUpdate()) {
                atLeastOneClientIsUpdated = true;
            }
        }
    }

    private void loadInitialDistances(Path inputFilePath) {
        clients = new Hashtable<>();
        // TODO: Use inputFilePath to load clients
    }

    private void printInitialData() {
        for (String clientId : clients.keySet()) {
            INode<IMessage> client = clients.get(clientId);
            logger.i("Client " + clientId + " loaded.");
            Hashtable<String, String> forwardingTable = client.getForwardingTable();
            logger.d("Client's initial forwarding table: ");
            for (String destination : forwardingTable.keySet()) {
                String target = forwardingTable.get(destination);
                logger.d("Destination: " + destination + ", Forwarding Target: " + target);
            }
        }
    }
}

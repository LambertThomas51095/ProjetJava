package dataAccess;

import model.*;
import exception.*;

import java.util.ArrayList;


public interface AgentDataAccess {

    void addAgent(Agent agent) throws ConnectionException, AccessException;
    Agent getAgent(Integer personnalNumber, String fisrtName, String lastName) throws AgentException, ConnectionException, AccessException;
    ArrayList<Agent> getAllAgents();
    void modifyAgent(Agent agent) throws ConnectionException, AccessException;
    void deleteAgent(Agent agent) throws ConnectionException, AccessException;

    // + fct servant aux 3 recherches..

}
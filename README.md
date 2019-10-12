# Comp 416 - Network - Homework 3 Repository

- Project 3 for KU Fall 2018 Network Lecture

This project work is about the network layer of the Internet protocol stack. It involves the
Distance Vector Routing algorithm. The objectives are to develop a discrete event routing
simulator, and examine the network layer issues, the principles behind network layer services,
and routing (path selection). Through this project, you are asked to develop a network
simulator named RouteSim as specified in this document, perform simulations with
RouteSim, and report the performance results.

Recall that routing algorithms can be classified according to the type of information kept by
each router as either Global where all nodes have the complete topology information (Link
State Algorithm) or Decentralized where nodes only know physically connected neighbors
and link costs of neighbors, and they exchange information with neighbors (Distance Vector
Algorithm).

Distance Vector Routing is based on a distributed approach that allows nodes to discover the
destinations reachable in the network as well as the least cost path to reach each of these
destinations. The least cost path is computed based on the link costs, and each node maintains
its own distance vector and each of the neighbors’ distance vector.


## REPORT

[Report](https://github.com/nberktumer/network-hw3-comp416/blob/master/documents/Fall%202018_COMP416_Project3_RouteSim.pdf)

## LICENSE

Copyright [2018] Authors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

- http://www.apache.org/licenses/LICENSE-2.0
- or at [LICENSE](./LICENSE) file

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

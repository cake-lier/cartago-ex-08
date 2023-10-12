# JaCaMo by exercises — Exercise 08 — Linkability

In this exercise, you'll see the linking mechanism in action i.e., how to execute operations between different artifacts.
A "LinkedArtifact" needs to expose some operations in its linking interface,
and it needs to do so using a specific annotation on each operation.
A "LinkingArtifact" needs to use those operations inside its own operations.
It can do it in two ways:
the first one is to declare an "output port"
through a specific annotation at the artifact class level and then invoke inside it a specific method passing the output port,
the name of the operation to invoke and its parameters to it.
For this approach to work, the "linker agent"
who uses these two artifacts needs to invoke a special method to link the two through the output port.
The second way is to get the id of the artifact and then use the same method as before to invoke a linked operation, 
but substitute the artifact id to the output port name.

## Solution

All solution files are marked with the "solution" suffix, don't open them before solving the exercise!
# SleepyProteinHours
Note that equations are somewhat broken, Pt is slightly negative at times, and as you can't have a negative amount of proteins, it needed to be clamped and set to 0 if it ever went to that level.
This could be due to the ambiguity of the equations or just spaghetti code. It is worth noting that equation 5 from the paper has an extra ending parenthesis whose quantity is squared, so this may result in the acyclic nature of the simulation + the need to clamp Pt. 

# Liskov Substitution Principle (LSP)
LSP states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. This principle ensures that a subclass can stand in for its superclass and behave in the same way without introducing errors.

## Key Concepts of LSP

### Substitutability:
A subclass should be able to replace its superclass without causing any issues in the application.
Functions that use pointers or references to a base class must be able to use objects of a derived class without knowing it.

### Behavioral Consistency:
Subclasses should behave in a way that is consistent with the expectations set by the superclass. This includes adhering to the same contracts, invariants, and preconditions/postconditions.

### No Weaker Preconditions:
Subclasses should not require stricter conditions than the superclass.

### No Stronger Postconditions:
Subclasses should not impose stronger conditions on the results than the superclass.
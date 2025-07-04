# Order of constructor invocation
• Constructors are invoked in the order of their derivation 
• If a subclass constructor does not explicitly invoke a superclass constructor using super() in the first line, the Java compiler automatically inserts a call to the no argument constructor of the superclass. 
• If the superclass does not have a no-argument constructor, it will generate a compile-time error.
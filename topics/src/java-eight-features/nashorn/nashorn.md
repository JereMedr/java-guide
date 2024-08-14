# Nashorn 
Java 8 includes a new JavaScript engine called Nashorn, which allows developers to embed JavaScript 
code within Java applications.
```
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName("nashorn");
engine.eval("print('Hello from JavaScript')");
```
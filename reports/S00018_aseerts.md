Nice! You're using the `assert` statement in Java, which is great for catching bugs during development. Let me break this down for you:

---

### ✅ Code Overview

```java
public class S0020_Assert {

    static void parameterNeeded(String input) {
        assert input != null;
    }

    public static void main(String[] args) {
        parameterNeeded(null);
    }
}
```

---

### 🧠 What’s Going On?

You're using:

```java
assert input != null;
```

This line checks if `input` is **not null**. If `input` is `null`, it throws an `AssertionError`.

BUT — there's a catch...

---

### ⚠️ Important: **Assertions are disabled by default!**

- Unless you run your Java program with the `-ea` flag (**enable assertions**), that `assert` line does **nothing**.
  
So if you run this normally:

```bash
java S0020_Assert
```

No error. No output. Silent failure.

But if you run it like this:

```bash
java -ea S0020_Assert
```

You’ll get:

```
Exception in thread "main" java.lang.AssertionError
    at S0020_Assert.parameterNeeded(S0020_Assert.java:6)
    ...
```

---

### ✅ When to Use `assert`

- Good for **internal checks** during development.
- Use it when you assume something **must be true**, and want to fail fast if it's not.
- Don't use it for user input validation — that's for exceptions.

---

### 🔁 Optional: With a message

You can also do:

```java
assert input != null : "Input must not be null";
```

Then you'll get:

```
Exception in thread "main" java.lang.AssertionError: Input must not be null
```

Much more helpful while debugging.

---

### Summary

| Feature      | Behavior                     |
|--------------|-------------------------------|
| `assert`     | Validates assumptions         |
| Disabled by default | Must use `-ea` to enable |
| Fails with `AssertionError` if condition is false |
| Not for production error handling!            |

---

Want to see how this works with methods that return values or more complex expressions?
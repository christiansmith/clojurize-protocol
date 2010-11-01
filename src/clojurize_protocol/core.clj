(ns clojurize.core)

(defprotocol Clojurize
  
  (describe
   [adapter]
   [adapter params]
   "Describe a data store, database or collection.")

  (create
   [adapter data]
   "Create a database, collection, tuple or tuples
    depending on the data passed in.")

  (search
   [adapter]
   [adapter params]
   "Lookup by key or keys, conditional logic, map/reduce
    functions or special cases like pop.")

  (update
   [adapter data]
   [adapter conditions data]
   "Update existing tuples by matching identifiers
    or by conditions.")

  (delete
   [adapter params]
   "Destroy a database, collection, tuple or tuples
    by identifier or by conditions.")
  
  (modify
   [adapter params]
   "Alter the schema of a collection, if strictly structured.")

  (save
   [adapter data]
   "Create or update tuples representing the data provided.")
  
  (touch
   [adapter params]
   "Find or create tuples")

  (exists?
   [adapter data]
   "Check if a tuple or set of tuples exist in a database/collection
    and return true or false")

  (prompt
   [adapter expression]
   "Execute a native database expression."))

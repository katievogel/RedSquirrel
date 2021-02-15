(ns acme-corp.redsquirrel.core
  (:require [acme-corp.redsquirrel.cute]
            [acme-corp.redsquirrel.jumping]
            [acme-corp.redsquirrel.nuts]))

(defn init! []
  (acme-corp.redsquirrel.cute/init!)
  (acme-corp.redsquirrel.jumping/init!)
  (acme-corp.redsquirrel.nuts/init!))


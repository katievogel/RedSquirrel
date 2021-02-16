(ns acme-corp.redsquirrel.core
  (:require [acme-corp.redsquirrel.cute]
            [acme-corp.redsquirrel.jumping]
            [acme-corp.redsquirrel.ui]))

(defn init! []
  (acme-corp.redsquirrel.cute/init!)
  (acme-corp.redsquirrel.jumping/init!)
  (acme-corp.redsquirrel.nuts/init!)
  (acme-corp.redsquirrel.ui/init!))


(ns acme-corp.redsquirrel.core
  (:require [acme-corp.redsquirrel.adorable]
            [acme-corp.redsquirrel.jumping]
            [acme-corp.redsquirrel.ui]))

(defn init! []
  (acme-corp.redsquirrel.adorable/init!)
  (acme-corp.redsquirrel.jumping/init!)
  (acme-corp.redsquirrel.nuts/init!)
  (acme-corp.redsquirrel.ui/init!))


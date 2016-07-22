(ns messages.components.app
  (:require [messages.components.profile :as profile]))

;; Top level app component

(defn app [app-state]
  [:div {:className "messages"}
    [profile/profile app-state]])

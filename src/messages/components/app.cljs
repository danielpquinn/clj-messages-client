(ns messages.components.app
  (:require [messages.components.signup :as profile]))

;; Top level app component, renders current-page component
;; which is stored in global application state

(defn app [app-state]
  [(:page @app-state)])

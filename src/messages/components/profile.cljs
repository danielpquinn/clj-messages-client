(ns messages.components.profile
  (:require [reagent.core :as reagent]
            [messages.components.forms :as forms]))

;; Allows user to view and edit their profile information

;; Handle form submission

(defn handle-submit [e app-state username]
  (.preventDefault e)
  (swap! app-state assoc-in [:user :username] @username))

;; User profile form

(defn profile [app-state]
  (let [username (reagent/atom (get-in @app-state [:user :username]))]
    (fn []
      [:form {:className "profile" :on-submit #(handle-submit % app-state username)}
        (forms/labeled-atom-input "text" "Username" "username" username)])))

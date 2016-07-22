(ns messages.components.signup
  (:require [reagent.core :as reagent]
            [messages.components.forms :as forms]))

;; Handle form submission

(defn handle-submit [e username email password password-confirm]
  (.log js/console @username @email @password @password-confirm)
  (.preventDefault e))

;; Signup component

(defn signup []
  (let [username (reagent/atom "")
        email (reagent/atom "")
        password (reagent/atom "")
        password-confirm (reagent/atom "")]
    (fn []
      [:div {:class-name "row signup"}
        [:form {:className "col-4 col-offset-4" :on-submit #(handle-submit % username email password password-confirm)}
          (forms/labeled-atom-input "Username" "text" "username" username)
          (forms/labeled-atom-input "Email" "text" "email" email)
          (forms/labeled-atom-input "Password" "password" "password" password)
          (forms/labeled-atom-input "Confirm password" "password" "password-confirm" password-confirm)
          [:button {:type "submit"} "Sign up"]]])))

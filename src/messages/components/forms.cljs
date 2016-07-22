(ns messages.components.forms)

;; Components used to compose forms

;; String atom input component

(defn atom-input [type name atom]
  [:input {:type type :name name :value @atom :on-change #(reset! atom (-> % .-target .-value))}])

;; String atom input with label

(defn labeled-atom-input [label type name atom]
  [:div {:className "row labeled-input"}
    [:div {:className "col-6 labeled-input-label"}
      [:label {:for name} label]]
    [:div {:className "col-6 labeled-input-input"}
      (atom-input type name atom)]])

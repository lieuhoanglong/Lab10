from pycaret.datasets import get_data
from pycaret.regression import *

data = get_data('insurance')
s = setup(data, target = 'charges', session_id = 123)
lr = create_model('lr', verbose = False)

plot_model(lr)

s2 = setup(data, target = 'charges', session_id = 123,
           normalize = True,
           polynomial_features = True, trigonometry_features = True, feature_interaction=True, 
           bin_numeric_features= ['age', 'bmi'])

s2[0].columns
lr = create_model('lr', verbose = False)
plot_model(lr)

save_model(lr, 'deployment_01092020')
deployment_01092020 = load_model('deployment_01092020')

deployment_01092020
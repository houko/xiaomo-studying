# 指向内部 API 服务器的主机名
APISERVER=https://kubernetes.default.svc

# 服务账号令牌的路径
SERVICEACCOUNT=/var/run/secrets/kubernetes.io/serviceaccount

# 读取 Pod 的名字空间
NAMESPACE=$(cat ${SERVICEACCOUNT}/namespace)

# 读取服务账号的持有者令牌
TOKEN=$(cat ${SERVICEACCOUNT}/token)

# 引用内部证书机构（CA）
CACERT=${SERVICEACCOUNT}/ca.crt

# 使用令牌访问 API
curl --cacert ${CACERT} --header "Authorization: Bearer ${TOKEN}" -X GET ${APISERVER}/api

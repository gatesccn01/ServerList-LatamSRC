package com.elmandarin.listlatamsrclib.constans;

/**
 * -By LatamSRC
 */
public interface SettingsConstants {

    // Geral
    public static final String
            AUTO_CLEAR_LOGS_KEY = "autoClearLogs",
            APILATAMIP = "apilatamsrcv2ray",
            HIDE_LOG_KEY = "hideLog",
            USER_HWID = "userorhwid",
            USER_LOGIN = "userlogin",
            PASSW_LOGIN = "passwlogin",
            MODO_DEBUG_KEY = "modeDebug",
            BLOQUEAR_ROOT_KEY = "blockRoot",
            TETHERING_SUBNET = "tetherSubnet",
            DISABLE_DELAY_KEY = "disableDelaySSH",
            MAXIMO_THREADS_KEY = "numberMaxThreadSocks",

    FILTER_APPS = "filterApps",
            FILTER_BYPASS_MODE = "filterBypassMode",
            FILTER_APPS_LIST = "filterAppsList",

    PROXY_IP_KEY = "proxyRemoto",
            PROXY_PORTA_KEY = "proxyRemotoPorta",
            CUSTOM_PAYLOAD_KEY = "proxyPayload",
            PROXY_USAR_DEFAULT_PAYLOAD = "usarDefaultPayload",
            PROXY_USAR_AUTENTICACAO_KEY = "usarProxyAutenticacao";

    public static final String
            CONFIG_PROTEGER_KEY = "protegerConfig",
            CONFIG_MENSAGEM_KEY = "mensagemConfig",
            CONFIG_VALIDADE_KEY = "validadeConfig",
            CONFIG_MENSAGEM_EXPORTAR_KEY = "mensagemConfigExport",
            CONFIG_INPUT_PASSWORD_KEY = "inputPassword";

    // Vpn
    public static final String
            DNSFORWARD_KEY = "dnsForward",
            DNSRESOLVER_KEY = "dnsResolver",
            WAKELOCK_KEY = "wakelock",

    UDPFORWARD_KEY = "udpForward",
            BYPASS_KEY = "bypassKey",
            UDPRESOLVER_KEY = "udpResolver";


    // SSH
    public static final String
            SERVIDOR_KEY = "sshServer",
            SERVIDOR_PORTA_KEY = "sshPort",
            USUARIO_KEY = "sshUser",
            SENHA_KEY = "sshPass",
            KEYPATH_KEY = "keyPath",
            CHAVE_KEY = "chaveKey",
            NAMESERVER_KEY = "serverNameKey",
            DNS_KEY = "dnsKey",
            PORTA_LOCAL_KEY = "sshPortaLocal",
            PINGER_KEY = "pingerSSH";

    public static final String
            PAYLOAD_DEFAULT = "CONNECT [host_port] [protocol][crlf][crlf]",
            CUSTOM_SNI = "sslSNI";

    // Tunnel Type
    public static final String
            TUNNELTYPE_KEY = "tunnelType",
            TUNNEL_TYPE_SSH_DIRECT = "sshDirect",
            TUNNEL_TYPE_SSH_PROXY = "sshProxy",
            TUNNEL_TYPE_SSH_SSLTUNNEL = "sshSslTunnel";
    ;

    public static final String
            UDP_SERVER = "udpserver",
            UDP_AUTH = "udpauth",
            UDP_OBFS = "udpobfs",
            UDP_DOWN = "udpdown",
            UDP_UP = "udpup",
            RECONNECT_UDP = "reconectarudp",
            UDP_BUFFER = "udpbuffer",
            V2RAY_JSON = "v2rayjson";


    public static final int
            bTUNNEL_TYPE_SSH_DIRECT = 1,
            bTUNNEL_TYPE_SSH_PROXY = 2,
            bTUNNEL_TYPE_SSH_SSL = 3,
            bTUNNEL_TYPE_SSL_PAYLOAD = 4,
            bTUNNEL_TYPE_SSL_RP = 5,
            bTUNNEL_TYPE_SLOWDNS = 6,
            bTUNNEL_TYPE_UDP = 7,
            bTUNNEL_TYPE_V2RAY = 8;
}
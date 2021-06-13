Pod::Spec.new do |s|
  s.name       = 'KMPNativeCoroutinesCore'
  s.version    = '0.1.0'
  s.summary    = 'Swift library for Kotlin Coroutines'

  s.homepage   = 'https://github.com/rickclephas/KMP-NativeCoroutines'
  s.license    = 'MIT'
  s.authors    = 'Rick Clephas'

  s.source = {
    :git => 'https://github.com/rickclephas/KMP-NativeCoroutines.git',
    :tag => 'v' + s.version.to_s
  }

  s.ios.deployment_target = '9.0'
  s.osx.deployment_target = '10.9'

  s.source_files = 'KMPNativeCoroutinesCore/**/*.swift'
end
//: A SpriteKit based Playground

import PlaygroundSupport
import SpriteKit

class GameScene: SKScene {
    
    private var label : SKLabelNode!
    private var spinnyNode : SKShapeNode!
    
    override func didMove(to view: SKView) {
        // Get label node from scene and store it for use later
        label = childNode(withName: "//helloLabel") as? SKLabelNode
        label.alpha = 0.0
        let fadeInOut = SKAction.sequence([.fadeIn(withDuration: 2.0),
                                           .fadeOut(withDuration: 2.0)])
        label.run(.repeatForever(fadeInOut))
        
        // Create shape node to use during mouse interaction
        let w = (size.width + size.height) * 0.05
        
        spinnyNode = SKShapeNode(rectOf: CGSize(width: w, height: w), cornerRadius: w * 0.3)
        spinnyNode.lineWidth = 2.5
        
        let fadeAndRemove = SKAction.sequence([.wait(forDuration: 0.5),
                                               .fadeOut(withDuration: 0.5),
                                               .removeFromParent()])
        spinnyNode.run(.repeatForever(.rotate(byAngle: CGFloat(Double.pi), duration: 1)))
        spinnyNode.run(fadeAndRemove)
    }
    
    @objc static override var supportsSecureCoding: Bool {
        // SKNode conforms to NSSecureCoding, so any subclass going
        // through the decoding process must support secure coding
        get {
            return true
        }
    }
    
    func touchDown(atPoint pos : CGPoint) {
        guard let n = spinnyNode.copy() as? SKShapeNode else { return }
        
        n.position = pos
        n.strokeColor = SKColor.green
        addChild(n)
    }
    
    func touchMoved(toPoint pos : CGPoint) {
        guard let n = self.spinnyNode.copy() as? SKShapeNode else { return }
        
        n.position = pos
        n.strokeColor = SKColor.blue
        addChild(n)
    }
    
    func touchUp(atPoint pos : CGPoint) {
        guard let n = spinnyNode.copy() as? SKShapeNode else { return }
        
        n.position = pos
        n.strokeColor = SKColor.red
        addChild(n)
    }
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        for t in touches { touchDown(atPoint: t.location(in: self)) }
    }
    
    override func touchesMoved(_ touches: Set<UITouch>, with event: UIEvent?) {
        for t in touches { touchMoved(toPoint: t.location(in: self)) }
    }
    
    override func touchesEnded(_ touches: Set<UITouch>, with event: UIEvent?) {
        for t in touches { touchUp(atPoint: t.location(in: self)) }
    }
    
    override func touchesCancelled(_ touches: Set<UITouch>, with event: UIEvent?) {
        for t in touches { touchUp(atPoint: t.location(in: self)) }
    }
    
    override func update(_ currentTime: TimeInterval) {
        // Called before each frame is rendered
    }
}

// Load the SKScene from 'GameScene.sks'
let sceneView = SKView(frame: CGRect(x:0 , y:0, width: 640, height: 480))
if let scene = GameScene(fileNamed: "GameScene") {
    // Set the scale mode to scale to fit the window
    scene.scaleMode = .aspectFill
    
    // Present the scene
    sceneView.presentScene(scene)
}

PlaygroundSupport.PlaygroundPage.current.liveView = sceneView
